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

// 【重要】
// JavaScriptでは、全てのものが「オブジェクト」となっている。
// オブジェクトというのは、１箇所に関連する機能をまとめたもの。
// 例えば、以下のようなコード。
// var guessField = document.querySelector('.guessField');
// これは、documentオブジェクトのquerySelectorメソッドを使用して、必要な要素を選択している。

// ボタンを押すとテキスト追加
function createParagraph() {
    var para = document.createElement('p');
    para.textContent = 'ボタンが押されました！';
    document.body.appendChild(para);
}

var buttons = document.querySelectorAll('button');

for (var i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener('click', createParagraph);
}

// 数当てゲーム
var randomNumber = Math.floor(Math.random() * 100) + 1;
var guesses = document.querySelector('.guesses');
var lastResult = document.querySelector('.lastResult');
var lowOrHi = document.querySelector('.lowOrHi');

var guessSubmit = document.querySelector('.guessSubmit');
var guessField = document.querySelector('.guessField');

var guessCount = 1;
var resetButton;
guessField.focus(); // サイトを開いた時、フォーカスを合わせてくれる

function checkGuess() {
    // 入力値を数値に変換し、randomNumberと比較
    var userGuess = Number(guessField.value);
    if(guessCount === 1) {
        guesses.textContent = '前回の予想：';
    }
    guesses.textContent += userGuess + '';

    if(userGuess === randomNumber) {
        lastResult.textContent = 'おめでとう！正解です！';
        lastResult.style.backgroundColor = 'green';
        lowOrHi.textContent = '';
    } else if(guessCount === 10) {
        lastResult.textContent = '!!!GAME OVER!!!';
        setGameOver();
    } else {
        lastResult.textContent = '間違いです！';
        lastResult.style.backgroundColor = 'red';
        if(userGuess < randomNumber) {
            lowOrHi.textContent = '今の予想は小さすぎです！もっと大きな数字です。';
        } else if(userGuess > randomNumber) {
            lowOrHi.textContent = '今の予想は大きすぎです！もっと小さな数字です。';
        }
    }

    // 次の予想入力の準備
    guessCount++;
    guessField.value = '';
    guessField.focus();
}

// HTMLで「class="guessSubmit"」と定義しているSubmitボタンに対して、イベントリスナーを追加。
// 発生したことを知りたいイベントの種類（ここではclick）と、
// イベントが発生した場合に実行するコード（ここではcheckGuess）をとる関数
guessSubmit.addEventListener('click', checkGuess);

function setGameOver() {
    guessField.disabled = true;
    guessSubmit.disabled = true;
    resetButton = document.createElement('');
    resetButton.textContent = '新しいゲームを始める';
    document.body.appendChild(resetButton);
    resetButton.addEventListener('click', resetGame);
}

function resetGame() {
    guessCount = 1;
    
    var resetParas = document.querySelectorAll('.resetParas p');
    for(var i = 0; i < resetParas.length; i++) {
        resetParas[i].textContent = '';
    }

    resetButton.parentNode.removeChile(resetButton);

    guessField.disabled = false;
    guessSubmit.disable = false;
    guessField.value = '';
    guessField.focus();

    lastResult.style.backgroundColor = 'white';
    randomNumber = Math.floor(Math.LN10)
}

var alert_button = document.querySelector('.alert_button');
alert_button.onclick = function() {
    var name = prompt('あなたの名前は？');
    alert('こんにちは、' + name + 'さん！');
}