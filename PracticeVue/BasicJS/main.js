// Javascriptは、動的にコンテンツを更新したり、マルチメディアを管理したりできるスクリプト言語。
// ブラウザが読み取り実行するため、APIを使い、容易に開発することが可能。

// APIの種類
//     ・ブラウザAPI
//         Webブラウザに組み込まれている。DOMやCanvasなど。
//     ・サードパーティAPI
//         TwitterAPIなどブラウザに組み込まれていないもの。

// 実行方式について
//     ・クライアントサイドコード
//         ページのクライアントサイドコードがダウンロードされ、ユーザのコンピュータで実行される。
//     ・サーバサイドコード
//         サーバ上で実行され、結果がブラウザにダウンロードされる。
//         サーバサイド言語：PHP, Python, Rubyなど。
//         JSもサーバサイドで用いられ、例としてNode.js環境がある。

function createParagraph() {
    var para = document.createElement('p');
    para.textContent = 'ボタンが押されました！';
    document.body.appendChild(para);
}

var buttons = document.querySelectorAll('button');

for (var i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener('click', createParagraph);
}