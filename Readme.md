# javaさえインストールされていれば、すぐにseleniumが動かせるgradleプロジェクト

## はじめに
javaさえインストールされているば、すぐにseleniumが動かせるgradleプロジェクトを作ってみました。
[WebDriverManager](https://github.com/bonigarcia/webdrivermanager) を使って、
javaコードの中で自動的にwebdriverをインストールしています。

## 前提条件
* Chromeがインストールされている
* java(11.0.8以上)がインストールされている

## 動かし方
```shell script
cd <本リポジトリをcloneした場所>
./gradlew clean run
# Chromeが起動してGoogle検索を行う
```
