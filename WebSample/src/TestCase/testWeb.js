const Newtours = require('../Object/newtours')
const assert = require('assert')

const url = 'http://newtours.demoaut.com/mercurywelcome.php'

describe('Test newtours page', () => {
  it('should sign on successful', () => {
    browser.url(url)
    Newtours
      .ClickSignOn_btn()
      .SetPassword()
      .SetUserName()
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
