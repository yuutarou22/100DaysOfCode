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

## Python 基本文法について
### 関数
- 標準ライブラリ
  - 組み込み関数（import不要）
  - import必要な関数
- 外部ライブラリ
  - ダウンロードや事前設定、importも必要な関数
    - pip3などでダウンロードする



