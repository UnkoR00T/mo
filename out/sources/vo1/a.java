package vo1;

import android.content.Context;
import ay.j;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvo1/a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Ln10/d;", "encryptedDataConverter", "Lp10/b;", "databaseKeyProvider", "Lo10/c;", "e", "(Landroid/content/Context;Ln10/d;Lp10/b;)Lo10/c;", "databaseFactory", "Lq10/a;", "databaseRegistry", "Lp10/f;", "f", "(Landroid/content/Context;Lo10/c;Lq10/a;)Lp10/f;", "b", "(Landroid/content/Context;)Lq10/a;", "a", "()Lp10/b;", "d", "()Ln10/d;", "Lay/j;", "jsonSerializer", "Liy/g;", "aes", "Lpy/a;", "aesKeyDecoder", "Ln10/c;", "c", "(Lay/j;Lp10/b;Liy/g;Lpy/a;)Ln10/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f207668a = new a();

    private a() {
    }

    public final p10.b a() {
        return new p10.c();
    }

    public final q10.a b(Context applicationContext) {
        return new q10.c(applicationContext, "mockedDatabaseRegistryFileName");
    }

    public final n10.c c(j jsonSerializer, p10.b databaseKeyProvider, iy.g aes, py.a aesKeyDecoder) {
        return new n10.a(jsonSerializer, databaseKeyProvider, aes, aesKeyDecoder);
    }

    public final n10.d d() {
        return new n10.d();
    }

    public final o10.c e(Context applicationContext, n10.d encryptedDataConverter, p10.b databaseKeyProvider) {
        return new o10.c(applicationContext, databaseKeyProvider);
    }

    public final p10.f f(Context applicationContext, o10.c databaseFactory, q10.a databaseRegistry) {
        return new p10.f(applicationContext, databaseFactory, databaseRegistry);
    }
}
