
Goal : Make a project on Google App Engine with Play and gae.


How it works ?

Go to the web page : http://1.applicationwatcher.appspot.com/

You will see a table with all alerts.
All you have to do is to send a POST request (ex : http://1.applicationwatcher.appspot.com//alert?date=TEST&level=ERROR&servers=SERV1&msg=blop)
and then go on the main page.So you you will see your alert.http://1.applicationwatcher.appspot.com/


Test with the following :

    Linux ubuntu 12.10
    java version "1.6.0_27"
    Play 1.2.5
    gae-1.6.0
    siena-2.0.6


Install :

export GAE_PATH=/opt/soft/appengine-java-sdk-1.7.5/
export PATH=$PLAY_HOME:$JAVA_HOME/bin:$PATH:$GAE_PATH


Build :

 play clean
 play gae:package


Deploy :

 play gae:deploy
 If you read console, you should see the tmp war directory : /tmp/test-gae.war/

 If you use a proxy :
 /opt/soft/appengine-java-sdk-1.7.5/bin/appcfg.sh -p MYPROXY:PORT update /tmp/test-gae.war/


How to make a POST request in Java ?

See https://github.com/drieu/Tools.

Link use to make this small application : http://blog.infin-it.fr/2010/12/27/une-application-play-sur-google-appengine/