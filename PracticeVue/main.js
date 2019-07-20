var STORAGE_KEY = 'todos-vuejs-demo'
var todoStorage = {
  fetch: function() {
    var todos = JSON.parse(
      localStorage.getItem(STORAGE_KEY) || '[]'
    )
    todos.forEach(function(todo, index) {
      todo.id = index
    })
    todoStorage.uid = todos.length
    return todos
  },
  save: function(todos) {
    localStorage.setItem(STORAGE_KEY, JSON.stringify(todos))
  }
}

// コンストラクタ関数 Vueを使って、ルートインスタンスを作成する。
// アプリケーションで使用したいデータはdataオプションへ登録していく。
const app = new Vue({
    el: '#app',
    data: {
        // ToDoリスト用の空配列をdataオプションに登録する（データがない時も配列と認識させるため）
        watch: {
          todos: {
            handler: function(todos) {
              todoStorage.save(todos)
            },
            deep: true
          }
        }
    },
    methods: {
        // ToDo　追加処理
        doAdd: function(event, value) {
          // ref で名前をつけていた要素を参照
          var comment = this.$refs.comment
          // 入力がなければ何もせずreturn
          if (!comment.value.length) {
            return
          }
          // {新しいID, コメント, 作業状態}というオブジェクトを現在のToDoリストへ追加
          // 作業状態のStateはデフォルトで「作業＝０」で作成して
          this.todos.push({
            id: todoStorage.uid++,
            comment: comment.value,
            state: 0
          })
          // フォーム要素を空にする
          comment.value = ''
        }
    },
    watch: {
      // オプションを使う場合は、オブジェクト形式にする
      todos: {
        // 引数はウォッチしているプロパティの変更後の値
        handler: function(todos) {
          todoStorage.save(todos)
        },
        // deepオプションで、ネストしているデータも監視！
        deep: true
      }
    }
})