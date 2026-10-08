package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteCustomFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase.CustomFunction f135449a;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i15, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            throw new IllegalArgumentException("name must not be null.");
        }
        this.name = str;
        this.numArgs = i15;
        this.f135449a = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.f135449a.a(strArr);
    }
}
