
Feature: https://catchylabs-webclient.testinium.com/signIn

  @Test1
    Scenario: Kullanicinin Para Gonderme Islemini Gerceklestırmesı
      Given Catchylabs uygulamasına gidilir
      When Username girilir
      When Password girilir.
      When Login Butona tiklanir
      When Open Money Transfer butonuna tiklanir
      When Transfer Money butonuna tiklanir
      When Sender Account merveeaksoy seçilir
      When Receiver Account Testinium-1 seçilir.
      When Amount degeri 100 girilir
      When Send butonuna tıklanir
      Then Gonderilen Amount degeri dogrulanir

    @Test2
    Scenario: Kullanicinin Hesap Bilgisi Duzenleme Islemini Gerceklestirmesi
      Given Catchylabs uygulamasına gidilir
      When Username girilir
      When Password girilir.
      When Login Butona tiklanir
      When Open Money Transfer butonuna tiklanir
      When Edit Account butonuna tiklanir
      When Yeni Account name girilir
      When Update Butona tıklanir
      Then Update edilen account dogrulanir

    @Test3
    Scenario Outline: Add Money Alanında Zorunlu Alan Kontrolü
      Given Catchylabs uygulamasına gidilir
      When Username girilir
      When Password girilir.
      When Login Butona tiklanir
      When Open Money Transfer butonuna tiklanir
      When Add Money butona tiklanir
      When Add Butona tiklanir.
      Then Check "<error>" hatayı kontrol et
      Examples:
      |error        |
      |Required     |