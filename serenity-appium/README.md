# Serenity Appium project

## Get the code

Git:

    git clone https://github.com/MinhLe97/AutomationSampleProject.git
    cd AutomationSampleProject/serenity-appium


Or simply [download a zip](https://github.com/MinhLe97/AutomationSampleProject/archive/master.zip) file.

## Use Maven
Install [Maven](https://maven.apache.org/install.html)

Build project with [Maven](https://maven.apache.org/run-maven/)

## Before Run
Input credential information in serenity.properties [file](serenity.properties)
###Saucelabs emulator ([user setting](https://app.saucelabs.com/user-settings))
    saucelabs.url=https://{userid}:{accessKey}f@ondemand.us-west-1.saucelabs.com:443/wd/hub
    saucelabs.access.key={accessKey}
    saucelabs.user.id={userid}
###Saucelabs realDevice
    appium.hub=https://us1-manual.app.testobject.com/wd/hub
    appium.testobject_api_key={testobject_api_key}

## Run tests
Right click on GuruWebTest and select 'Run'