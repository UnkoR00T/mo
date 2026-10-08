package gc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgc4/c;", "Lac4/c;", "Laz/f;", "fileManager", "Laz/c;", "envFileProvider", "Lpx/d;", "remoteLogger", "<init>", "(Laz/f;Laz/c;Lpx/d;)V", "", "fileName", "", "number", "fileExtension", "d", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "Lac4/c$a;", "params", "Ldx/i;", "Ldx/b;", "f", "(Lac4/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Laz/f;", "b", "Laz/c;", "c", "Lpx/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements ac4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.c envFileProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f71832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f71833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f71834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f71835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f71836h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f71837j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f71838k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f71839l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f71840m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f71841n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f71843q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f71841n = obj;
            this.f71843q |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(az.f fVar, az.c cVar, px.d dVar) {
        this.fileManager = fVar;
        this.envFileProvider = cVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    private final String d(String fileName, Integer number, String fileExtension) {
        String string;
        String absolutePath = this.envFileProvider.a().getAbsolutePath();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(absolutePath);
        sb5.append('/');
        sb5.append(fileName);
        if (number != null) {
            int iIntValue = number.intValue();
            StringBuilder sb6 = new StringBuilder();
            sb6.append('(');
            sb6.append(iIntValue);
            sb6.append(')');
            string = sb6.toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        sb5.append(string);
        sb5.append('.');
        sb5.append(fileExtension);
        return sb5.toString();
    }

    static /* synthetic */ String e(c cVar, String str, Integer num, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            num = null;
        }
        return cVar.d(str, num, str2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x0122  */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0159  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0116 -> B:34:0x011b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(ac4.c.Params r18, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r19) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc4.c.c(ac4.c$a, tq.e):java.lang.Object");
    }
}
