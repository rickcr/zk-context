#!/bin/sh
 
APP_NAME=zk-context

echo "Copying zul files to $TOMCAT_HOME/webapps/$APP_NAME/pages/ "
cp -fr src/main/webapp/pages $TOMCAT_HOME/webapps/$APP_NAME/
echo "complete"
