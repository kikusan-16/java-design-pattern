## 目次

[TOC]

## ソース

[全部入りサンプルソース](https://github.com/kikusan-16/java-design-pattern.git)

## オブジェクトの生成に関するパターン

### Factory Method

<img class="w-100" src="/media/uploads/2020/09/13/FactoryMethod.png"> 

インスタンスの生成をサブクラスに任せる

- 利用シーン
    - 生成しなければいけないインスタンスを事前に把握できないとき。
    - インスタンス生成時の処理を1箇所にまとめるとき。

### Abstract Factory

<img class="w-100" src="/media/uploads/2020/09/13/AbstractFactory.png"> 

関連しあったオブジェクト群のインスタンスを生成する（利用するクラスを動的に変更する）

- 利用シーン
    - 複数のサブクラス群をまとめて変更したいとき
- 留意点
    - Classクラスを使って動的にインスタンスを生成すると良い
    - あらかじめ機能が決まっていないと、追加は大変。
    
### Builder

<img class="w-100" src="/media/uploads/2020/09/13/Builder.png"> 

複雑なインスタンスを動的に作成する（処理を移譲する）

- 利用シーン
    - 段階的にインスタンスを生成する場合。インスタンス生成のコードを1箇所にまとめる効果もある。
    - インスタンスの生成プロセスが多様な場合。
- 留意点
    - Builderのインターフェースで拡張要件に備えられるかを検討する必要がある。

### Prototype

<img class="w-100" src="/media/uploads/2020/09/13/Prototype.png"> 

雛形のオブジェクトを用意して、コピーする

- 利用シーン
    - 少しだけ異なるインスタンスを多数生成する場合。
- 留意点
    - 仮想インスタンスは同じ名前のものは参照先が同じなので、別々の仮想インスタンスで同じフィールドを共有している。

### Singleton

<img class="w-100" src="/media/uploads/2020/09/13/Singleton.png"> 

インスタンスが１つしか存在しないクラスを作る

- 利用シーン
    - システム上でインスタンスが1つだけしか存在してはならない場合。

## プログラムの構造に関するパターン

### Adapter

<img class="w-100" src="/media/uploads/2020/09/13/Adapter.png"> 

あるクラスを別のインターフェースに変更する（例:VersionUp）

- 利用シーン
    - 既存のクラスを利用したいが、必要なインターフェースと一致していない場合。
- 留意点
    - 複数のAdapteeを使う場合は移譲を使ったAdapterパターンを作る。

### Bridge

<img class="w-100" src="/media/uploads/2020/09/13/Bridge.png"> 

機能と実装の階層を分ける。（継承を使うとサブクラスが増えすぎてしまうとき）

- 利用シーン
    - 機能と実装の結合を緩やかにしたいとき（環境に合わせてパーツを変えたいときなど）
    - 機能と実装をそれぞれ拡張可能にする場合。
- 留意点
    - 機能と実装は必ず分ける。

### Composite

<img class="w-100" src="/media/uploads/2020/09/13/Composite.png"> 

木構造を再帰的に表現する

- 利用シーン 
    - 木構造を持つオブジェクトを表現するとき（例:ディレクトリ）
- 留意点
    - 階層が増えると改修が大変

### Decorator

<img class="w-100" src="/media/uploads/2020/09/13/Decorator.png"> 

クラスの組み合わせを変えて機能を追加する

- 利用シーン 
    - インターフェースを変えずに機能を追加したいとき

### Facade

<img class="w-100" src="/media/uploads/2020/09/13/Facade.png"> 

ファザード：複雑な処理をまとめてインターフェースとして公開する

- 利用シーン
    - 処理をまとめるとき
    - クラスとクライアント間の結合度合を弱めたいとき

### Flyweight

<img class="w-100" src="/media/uploads/2020/09/13/Flyweight.png"> 

一度生成したインスタンスを共有して再利用する(Singletonを利用)

- 利用シーン
    - メモリを節約したいとき
    - 利用インスタンスに変更がないとき

### Proxy

<img class="w-100" src="/media/uploads/2020/09/13/Proxy.png"> 

代理人に処理を任せ、本人が必要なときだけ呼び出す（プロキシは代理人）。
処理を分けることで保守性が向上する

- 利用シーン
    - 代理人がしたい処理があるとき（存在チェック等）

## オブジェクトの振る舞いに関するパターン

### Chain Of Responsibility

<img class="w-100" src="/media/uploads/2020/09/13/ChainOfResponsibility.png"> 

処理を依頼する側と受け取る側の結合を緩める。
処理の連鎖を作成する。

- 利用シーン
    - 要求を処理するオブジェクトを動的に決定する場合

### Command

<img class="w-100" src="/media/uploads/2020/09/13/Command.png"> 

イベント管理を行う

- 利用シーン
    - 履歴の保存
    - redo・undo

### Interpreter

<img class="w-100" src="/media/uploads/2020/09/13/Interpreter.png"> 

言語を木構造で解釈する

- 利用シーン
    - 簡単な言語で動的な処理をしたいとき

### Iterator

<img class="w-100" src="/media/uploads/2020/09/13/Iterator.png"> 

イテレータを作成する

- 利用シーン
    - 配列やListに依存せずオブジェクトを取得したいとき

### Mediator

<img class="w-100" src="/media/uploads/2020/09/13/Mediator.png"> 

複数オブジェクトの関連性を一か所にまとめる

- 利用シーン
    - 多対多の関係を1対多にまとめるとき（ボタンの活性とか）

### Memento

<img class="w-100" src="/media/uploads/2020/09/13/Memento.png"> 

オブジェクトの状態を保存しておく

- 利用シーン
    - オブジェクトの状態を元に戻すとき

### Observer

<img class="w-100" src="/media/uploads/2020/09/13/Observer.png"> 

状態の変更を検知する

- 利用シーン
    - 1つのオブジェクトに変更があったとき、他のオブジェクトを変化させるとき

### State

<img class="w-100" src="/media/uploads/2020/09/13/State.png"> 

状態そのものを表す

- 利用シーン
    - 状態による分岐を多数利用している場合
    - 状態を追加する可能性がある場合

### Strategy

<img class="w-100" src="/media/uploads/2020/09/13/Strategy.png"> 

アルゴリズムの管理をする

- 利用シーン
    - アルゴリズムを追加・変更する場合
    - アルゴリズムを切り替えたいとき

### Template Method

<img class="w-100" src="/media/uploads/2020/09/13/TemplateMethod.png"> 

アルゴリズムの構造を変えずに似た処理を作る

- 利用シーン
    - 似たような処理が複数あるとき

### Visitor

<img class="w-100" src="/media/uploads/2020/09/13/Visitor.png"> 

データ構造と処理を分離する

- 利用シーン
    - 異なるインターフェースを持つデータ構造を利用する場合
    - データ構造に対する処理を追加・変更する場合

## 参照

レベルアップJava ～デザインパターン編～

[各デザインパターンの「使いどころ」を一言でまとめてみた](https://qiita.com/cooloon/items/62f182f77f70135e31bf)

[再考: GoF デザインパターン](https://qiita.com/irxground/items/d1f9cc447bafa8db2388)