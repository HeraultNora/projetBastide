<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CA par clients</title>
        <meta charset="UTF-8">
        <!-- On charge JQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <!-- On charge l'API Google -->
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript">
            // cf. https://developers.google.com/chart/interactive/docs/gallery/piechart
            google.charts.load('current', {'packages': ['corechart']});

            // On fait l'appel AJAX dès le chargement de la page
            google.charts.setOnLoadCallback(doAjax);

            function drawPiechart(result) {
                // On met le résultat au format attendu par google
                var data = [['Client', 'Prix unités vendues']];
                result.forEach(ligne => data.push([ligne.libelle, ligne.prix]));
                var dataTable = google.visualization.arrayToDataTable(data);

                var options = {title: 'Représentation du chiffre d affaires par client'};
                var chart = new google.visualization.PieChart(document.getElementById('piechart'));
                chart.draw(dataTable, options);
            }

            // Afficher les ventes par catégorie
            function doAjax() {
                $.ajax({
                    url: "mvc/service/unitesVendues/clients",
                    dataType: "json",
                    success: drawPiechart, // La fonction qui traite les résultats
                    error: showError
                });
            }

            // Fonction qui traite les erreurs de la requête
            function showError(xhr, status, message) {
                alert("Erreur: " + status + " : " + message);
            }

        </script>
    </head>
    <body>
        <h1>Chiffre d'affaires par client</h1>
        <!-- Le graphique apparaît ici -->
        <div id="piechart" style="width: 900px; height: 500px;"></div>
        <hr>
        <a href='mvc/service/unitesVendues/categories2' target="_blank">Voir les données brutes (JSON)</a>
        <hr>
        <a href="./">Retour au menu</a>
        <hr>
        <h3>Code source</h3>
        <ul>
            <li>Couche "Accès aux données"
                <ul>
                    <li><a href="https://bitbucket.org/rbastide/comptoirs_mvc/src/test/src/main/java/comptoirs/model/dao/StatisticsDao.java"  target="_blank">Le DAO qui fait les requêtes</a></li>
                    <li><a href="https://bitbucket.org/rbastide/comptoirs_mvc/src/test/src/main/java/comptoirs/model/dto/StatsResultCat.java"  target="_blank">le DTO qui représente les résultats des requêtes</a></li>
                </ul>
            </li>
            <li>Couche "Web" 
                <ul>
                    <li><a href="https://bitbucket.org/rbastide/comptoirs_mvc/src/test/src/main/java/service/StatisticsService.java"  target="_blank">le web service qui transmet les résultats en JSON ou XML</a></li>
                </ul>
            </li> 
            <li>Couche "Présentation"
                <ul>
                    <li><a href="https://bitbucket.org/rbastide/comptoirs_mvc/src/test/src/main/webapp/googlePieChart.html"  target="_blank">la page web qui fait l'appel AJAX et affiche le camembert (cette page)</a></li>
                </ul>
            </li>	
        </ul>
    </body>
</html>