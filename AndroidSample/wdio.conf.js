exports.config = {
    runner: 'local',
    port: 4723,
    path: '/wd/hub',
    specs: [
        './src/TestCase/webTest.js'
    ],
    exclude: [],
    maxInstances: 1,
    capabilities: [{
        sessionName:        'Automation test session',
        sessionDescription: 'This is an example for Android web', 
        deviceOrientation:  'portrait',  
        captureScreenshots: true, 
        browserName:        'chrome',
        deviceName:         'Galaxy A50',
        udid:               'R58M3549PPN',
        platformName:       'Android',
        chromeOptions:      {w3c : false}
    }],
    logLevel: 'info',
    bail: 0,
    baseUrl: 'http://newtours.demoaut.com/mercurywelcome.php',
    framework: 'mocha',
    reporters: ['spec'],
    ui: 'bdd',
    timeout: 60000
}
