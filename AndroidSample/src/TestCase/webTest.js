const Newtours = require('../Object/NewTour')
const assert = require('assert')

describe('Test newtours page', () => {
  before( () => {
    browser.url('http://newtours.demoaut.com/mercurywelcome.php')
    browser.setOrientation("LANDSCAPE")
  })

  it('should sign on successful', () => {
    Newtours
      .ClickSignOn_btn()
      .SetUserName()
      .SetPassword()
      .ClickLogin()
    browser.pause(3000)
    
    let signOnTitle = browser.getTitle()
    assert.equal(signOnTitle, 'Find a Flight: Mercury Tours:')
  })

  it('should select right arriving in', () => {
    Newtours
      .ClickOneWay()
      .SelectaArrivingIn()
      .ClickContinue()
    browser.pause(3000)

    let departInfo = Newtours.GetDepartInfo()
    assert.equal(departInfo, 'Acapulco to London')
  })

  it('should sign off successful', () => {
    Newtours
      .ClickSignOff()
    browser.pause(3000)

    let signOffTitle = browser.getTitle()
    assert.equal(signOffTitle, 'Sign-on: Mercury Tours')
  })
})