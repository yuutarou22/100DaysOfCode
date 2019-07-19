/**
 * スレッドを生成する時、スレッドをどのグループに含めるか指定する。
 * 指定していない場合、生成時点でスレッドグループ（カレントスレッドグループ）と同じグループに属する。
 * ※Java実行時、mainスレッドグループに属することになる。
 * スレッドは、生成時に属したスレッドグループに永久に属する。
 * スレッドグループは途中で変更できない。
 */
class Main {
    // ExThreadGroup というスレッドグループの作成を行う。
    ThreadGroup ExThreadGroup = new ThreadGroup("MyThreadGroup");

    // ExThread を生成し、ExThreadGroupグループに含める。
    Thread ExThread = new Thread(ExThreadGroup, "member of ExThreadGroup");
}