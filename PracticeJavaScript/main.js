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
let n1 = 100;
document.write("<p>n1 = " + n1 + "</p>");
let n2 = 3.14;
document.write("<p>n2 = " + n2 + "</p>");
let n3 = 2.4e-3;
document.write("<p>n3 = " + n3 + "</p>");

// 論理値
document.write("<p>" + (10 == 10) + "</p>");
document.write("<p>" + (15 < 8) + "</p>");

// オブジェクト型
/**
 * 同じような目的の値をまとめて管理する場合に用いると便利
 * 　・値に順番は無い。
 * 　・それぞれの値には名前（ID）がつけられている
 * 　・要素一つ一つは「プロパティ」と呼ばれる
 */
let siteurl = {
    "Yahoo Japan!" : "https://www.yahoo.co.jp/",
    "Google" : "https://www.google.com/",
    "Amazon" : "https://www.amazon.co.jp/"
};
let site = "Amazon";
document.write(site + "のURLは" + siteurl[site] + "です");

let obj = {
    width:100,
    height:80
};
document.write("<br>[ドット版] 高さは" + obj.height + "、横幅は" + obj.width);
document.write("<br>[連想配列版]高さは" + obj["height"] + "、横幅は" + obj["width"]);

let yearPoint = {
    "2017年" : 245,
    "2018年" : 312,
    "2019年" : 193
}
yearPoint["2020年"] = "orinpic"; //追加
delete yearPoint["2019年"]; // 削除

for (var i = 2017; i <= 2020; i++) {
    // 連想配列ならこんな使い方もできる
    var year = i + "年";
    document.write("<p>" + year + "は" + yearPoint[year] + "点でした！</p>");
}

// 配列
/**
 * オブジェクトと同様、同じような目的に値を多数使いたい時に配列を用いる。
 * 　・各値に順番をつけられ管理されている。
 * 　・インデックスと呼ばれる添字で配列に格納されている各値を参照することができる
 * 　・要素の追加はできるが、削除は不可（Arrayクラスのメソッドを使えば可能）
 * 「とりあえず定義」することも可能
 * [] 空の配列
 * [76,,87] 要素は3つだが、2番目の値が空
 * [,,,] 要素4つの空配列
 */
let student = ["佐藤", "田中", "山口", "斎藤", "松井"];
let result = [85, 20*4, 184 / 2, 62, 69];
student[student.length] = "吉岡";
result[result.length] = 100;
for (let i = 0; i < result.length; i++) {
    document.write("<p>" + student[i] + "さんは" + result[i] + "点でした！</p>");
}
let ary0 = [92, 80, 98];
let ary1 = [72, 98, 86];
let ary2 = [52, 79, 63];
let ary = [ary0, ary1, ary2];
for (var i = 0; i < ary.length; i++) {
    for (var j = 0; j < ary0.length; j++) {
        document.write("[" + i + "]" + "[" + j + "] = " + ary[i][j] + "<br>");
    }
}

// 関数の使い方
NumCheck(3);

function NumCheck(num) {
    if (num % 2 === 0) {
        document.write("<p>" + num + "は偶数です</p>");
    } else {
        document.write("<p>" + num + "は奇数です</p>");
    }
}

// グローバル関数
// 1. 文字列を整数に変換する関数(文字が混ざっていても問題ないが、先頭が数字でなければNaNを返す)
let tmp = "10";
document.write("<p>parseInt = " + parseInt(tmp) + "</p>");
tmp = "2019year";
document.write("<p>parseInt = " + parseInt(tmp) + "</p>");
tmp = "-88point";
document.write("<p>parseInt = " + parseInt(tmp) + "</p>");
tmp = "-44point";
document.write("<p>parseFloat = " + parseFloat(tmp) + "</p>");
tmp = "2.4e-4";
document.write("<p>parseFloat = " + parseFloat(tmp) + "</p>");

// 2. NaNかどうかを調べる関数

// 3. 値が有限値か、無限値か調べる関数