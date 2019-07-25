// 大文字小文字を区別する。
// 以下では、num2に代入されていないため、何も表示されない
let num = 10;
document.write("<p>" + num + "</p>");
// document.write("<p>" + num2 + "</p>");
// 上記コメントアウト解除すると、ここでエラーが起きるので、以降の処理が実行されない。

// JSはHTMLページ内で分散してスクリプトを記述していても、
// 全体として一つのスクリプトのように動作する。
document.write("<p>" + Num + "</p>");
// というか、HTMLのスクリプトも、別ファイルに切り分けたスクリプトも共通の領域にて動作していると考えていい

/* データ型 */
// 文字列
document.write("<p>文字列です</p>"); // ダブルクォート
document.write('<p>文字列です</p>'); // シングルクォート

// 数値
num = 100;
document.write("<p>num = " + num + "</p>");
let pie = 3.14;
document.write("<p>pie = " + pie + "</p>");
