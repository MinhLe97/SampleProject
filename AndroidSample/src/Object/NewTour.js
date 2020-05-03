const signOn_btn = '=SIGN-ON'
const login_btn = '[name="login"]'
const signOff_btn = '=SIGN-OFF'
const continue_btn = '[name="findFlights"]'
const userName_txtbx = '[name="userName"]'
const password_txtxbx = '[name="password"]'
const oneWay_rdibtn = '[value="oneway"]'
const arrivingIn = '[name="toPort"]'
const departInfo = '(//*[text()= "DEPART"]/following::font)[1]'

class Newtours {
  ClickSignOn_btn () {
    $(signOn_btn).waitForDisplayed(5000)
    $(signOn_btn).click()
    return this
  }

  SetUserName () {
    $(userName_txtbx).waitForDisplayed(5000)
    $(userName_txtbx).setValue('minh')
    return this
  }

  SetPassword () {
    $(password_txtxbx).waitForDisplayed(5000)
    $(password_txtxbx).setValue('minh')
    return this
  }

  ClickLogin () {
    $(login_btn).waitForDisplayed(5000)
    $(login_btn).click()
    return this
  }

  ClickOneWay () {
    $(oneWay_rdibtn).waitForDisplayed(5000)
    $(oneWay_rdibtn).click()
    return this
  }

  SelectaArrivingIn () {
    $(arrivingIn).waitForDisplayed(5000)
    $(arrivingIn).selectByVisibleText('London')
    return this
  }

  ClickContinue () {
    $(continue_btn).waitForDisplayed(5000)
    $(continue_btn).click()
    return this
  }

  GetDepartInfo() {
    $(departInfo).waitForDisplayed(5000)
    return $(departInfo).getText()
  }

  ClickSignOff () {
    $(signOff_btn).waitForDisplayed(5000)
    $(signOff_btn).click()
    return this
  }
}

module.exports = new Newtours()
