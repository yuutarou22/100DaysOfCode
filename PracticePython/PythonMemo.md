# Python Memo
- SyntaxError: Non-ASCII character '\xe6' in file...というエラーが出た場合<br>
ソースの頭にUTF-8だということを知らせる以下のソースを追加（#も含む）
`# -*- coding: utf-8 -*-`

- エスケープ文字を入力する際は、「Alt」+「¥」で入力できる。

- Pythonスクリプトから抜ける方法
    - `Control + D`
    - `exit()` コマンドを実行

## Python3系をインストールする
- Homebrewとは、MacOS上でソフトウェアの導入を単純化するパッケージ管理システム。<br>
実行ファイルや設定ファイル、ライブラリなどを含むものをパッケージと呼ぶ。<br>
このパッケージの（アン）インストールを一元管理するシステムのこと。
- https://qiita.com/vintersnow/items/fca0be79cdc28bd2f5e4

- Homebrewのインストール
`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`

- pyenvとは、Pythonの複数のバージョンを切り替えられるコマンドラインツール。（brewを使ってインストールする）

- pyenvのインストール
`brew install pyenv`

- シェル起動時に自動的に適用するため、PATHを通しておく
`vi ~/.bash_profile`
`export PATH="$HOME/.pyenv/shims:$PATH" #追記`
`source ~/.bash_profile #読み込ませる`

- インストール可能なPythonバージョンを確認する
`pyenv install -l`
`pyenv install -list`

- Pythonをインストールする（pyenvを使ってインストールする）
`pyenv install versionNumber`

- 現在使用しているPythonバージョンを確認する
`pyenv versions # *が付いているバージョン`

- 使用するPythonのバージョンを切り替える
`pyenv global versionNumber`

## Python 基本構成について
### 関数
- 標準ライブラリ
  - 組み込み関数（import不要）
  - import必要な関数
- 外部ライブラリ
  - ダウンロードや事前設定、importも必要な関数
    - pip3などでダウンロードする
    - 
- ※その関数が使われる前に定義をしておく必要がある！！！

### モジュール
- 関数を一つのファイルにまとめたもの。
- ファイル名から「.py」を抜いたのがモジュール名

### パッケージ
- モジュールを複数まとめて一つのディレクトリにまとめたもの。
- パッケージの中にパッケージを含めることも可能。
- 「親.子.モジュール」のように指定する。

### ライブラリ
- 関数、モジュール、パッケージの総称。
- または、パッケージにまとめて、インストールできるようにまとめたもの。

## tkinterを使えるようにする
- tkinterの存在を確認
`python3 -m tkinter`

- Kivyのインストール
  - `pip3 install kivy`
  - 


## aptとyum
どちらもパッケージのインストールなどを行う、パッケージ管理ツール。
（wget,curlはファイルダウンロードに使われる）

- apt
  - Debian系のOSで起動する。
- yum
  - RedHat系のOSで起動する。
- wget
  - HTTPやFTP経由のファイル取得を行えるコマンド。再帰的なダウンロードが得意で、ディレクトリなどでも参照先を全てたどることができる。
- curl
  - TP, FTPS, HTTP, HTTPS, GOPHER, TELNEなどの様々なプロトコルに対応した通信ライブラリ。"Client for URLs" に掛けている。

## pipとは
- パッケージを管理するためのツール
  - パッケージの種類
    - サードパーティが配布しているパッケージ（https://pypi.org/）
    - 公式が配布（Pythonに付属）
- pip と pip3の違い
  - Python2 と Python3 の間で大きくシステムが変わり、非互換な部分も出ているため分けられている。1つのシステムに Python2 と Python3 の両方を入れることもある。したがって、pip と pip3 を両方扱う場合もある。

