package ix1;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001a"}, d2 = {"Lix1/e;", "Lzg0/b;", "Lix1/b;", "visualizer", "Landroid/content/Context;", "context", "<init>", "(Lix1/b;Landroid/content/Context;)V", "Ljava/time/Instant;", "signingTime", "", "citizenName", "Lup/c;", "b", "(Ljava/time/Instant;Ljava/lang/String;)Lup/c;", "Lgp/c;", "document", "Lup/e;", "c", "(Lgp/c;Ljava/time/Instant;Ljava/lang/String;)Lup/e;", "", "pdf", "a", "([BLjava/time/Instant;Ljava/lang/String;)[B", "Lix1/b;", "Landroid/content/Context;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements zg0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b visualizer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public e(b bVar, Context context) {
        this.visualizer = bVar;
        this.context = context;
    }

    private final up.c b(Instant signingTime, String citizenName) {
        up.c cVar = new up.c();
        cVar.e(up.c.f199556b);
        cVar.h(up.c.f199562h);
        cVar.f(citizenName);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(Date.from(signingTime));
        cVar.g(calendar);
        return cVar;
    }

    private final up.e c(gp.c document, Instant signingTime, String citizenName) {
        up.e eVar = new up.e();
        eVar.r(0);
        eVar.u(this.visualizer.c(document, signingTime, citizenName));
        return eVar;
    }

    @Override // zg0.b
    public byte[] a(byte[] pdf, Instant signingTime, String citizenName) {
        try {
            yo.b.b(this.context);
            gp.c cVarD0 = gp.c.d0(pdf);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            cVarD0.m(b(signingTime, citizenName), c(cVarD0, signingTime, citizenName));
            up.b bVarY0 = cVarD0.Y0(byteArrayOutputStream);
            return Build.VERSION.SDK_INT >= 33 ? bVarY0.getContent().readAllBytes() : ar.a.c(bVarY0.getContent());
        } catch (Exception e15) {
            throw new RuntimeException(e15);
        }
    }
}
