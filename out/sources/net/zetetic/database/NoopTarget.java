package net.zetetic.database;

/* JADX INFO: loaded from: classes3.dex */
public class NoopTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public boolean a(String str, int i15) {
        return false;
    }

    @Override // net.zetetic.database.LogTarget
    public void b(int i15, String str, String str2, Throwable th4) {
    }
}
