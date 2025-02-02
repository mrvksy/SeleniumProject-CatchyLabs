# CatchyLabs Test Otomasyonu Projesi

Bu proje, CatchyLabs uygulamasının QE Study Case testlerini gerçekleştirmek için geliştirilmiştir. 

## Proje Genel Bakış

Test otomasyonu projesi, Selenium ve Cucumber kullanılarak farklı platformlarda fonksiyonel testlerin yapılmasını sağlar. Para transferi, hesap bilgileri güncelleme ve zorunlu alan doğrulamaları gibi test senaryolarını içerir. Otomasyon, Cucumber çerçevesiyle yazılmış ve TestNG ile çalıştırılmıştır, test raporları ise Cucumber Reports ile oluşturulmaktadır.

## Proje Mimarisi

- Reports
    - CucumberReport
        - Reports.html

- src
    - main
        - java
            - testRunners
                - Runner.java
            - utils
                - ConfigReader.java
                - DriverFactory.java
                - ElementHelper.java
                - Hooks.java
    - test
        - java
            - Features
                - Catchylabs.feature
            - Pages
                - CatchyPages
            - StepDefinitions
                - CatchyStepDefinitions
        - resources
            - config.properties
            - TestNG.xml


## Kullanılan Teknolojiler

- **Selenium**: Web uygulaması UI'ını otomatikleştirmek için kullanılır.
- **Cucumber**: Davranışa dayalı geliştirme (BDD) için kullanılır ve testlerin anlaşılabilir bir formatta yazılmasını sağlar.
- **TestNG**: Testlerin çalıştırılması ve yönetilmesi için kullanılır.
- **Cucumber Reports**: Test raporlarının oluşturulması için kullanılır.
- **Chrome**: Test otomasyonu için kullanılan tarayıcı.

## Özellikler

- **Para Transferi Test Senaryosu**
- **Hesap Bilgileri Düzenleme Test Senaryosu**
- **Zorunlu Alan Doğrulama Test Senaryosu**

## Kurulum Talimatları

### Gereksinimler

- **Java**: Java'nın yüklü olduğundan emin olun. Yüklü olup olmadığını şu komutla kontrol edebilirsiniz:
  ```bash
  java -version
  
- **Maven**: Maven'ı yükleyin. Yüklemeyi doğrulamak için şu komutu kullanabilirsiniz:
    ```bash
    mvn -version


IDE: Testlerin çalıştırılması ve hata ayıklama için IntelliJ IDEA veya Eclipse gibi bir IDE kullanmanız önerilir.

## Kurulum

- **Repoyu klonlayın:**

    ```bash
    git clone https://github.com/mrvksy/SeleniumProject-CatchyLabs.git
    cd SeleniumProject-CatchyLabs
    ```

- **Bağımlılıkları yükleyin:**

    ```bash
    mvn clean install
    ```

- **Testleri çalıştırın:**

    ```bash
    mvn test
    ```

### Cucumber Raporlarıyla Çalıştırma

Testleri çalıştırdıktan sonra, Cucumber test raporlarını oluşturmak için şu komutu kullanabilirsiniz:

```bash
mvn cucumber:report
```





