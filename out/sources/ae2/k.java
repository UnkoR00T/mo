package ae2;

import o04.UploadedFile;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zp0.BEIncidentReportFileServiceConfiguration;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lae2/k;", "Lae2/j;", "Lp04/b;", "uploadFileToCloudUC", "Laq0/b;", "beGetReportIncidentTypesUC", "Lez/a;", "currentTimeProvider", "<init>", "(Lp04/b;Laq0/b;Lez/a;)V", "Lo04/e;", "fileToUpload", "Lzp0/f;", "configuration", "Ldx/i;", "Ldx/b;", "Lo04/f;", "e", "(Lo04/e;Lzp0/f;Ltq/e;)Ljava/lang/Object;", "Lae2/j$a;", "params", "Lae2/j$b;", "d", "(Lae2/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp04/b;", "b", "Laq0/b;", "c", "Lez/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p04.b uploadFileToCloudUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final aq0.b beGetReportIncidentTypesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5608h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5609j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5610k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5611l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5612m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5613n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f5614p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f5615q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5616r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5617s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5618t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5619v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f5620w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f5621x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f5622y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f5623z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return k.this.c(null, this);
        }
    }

    public k(p04.b bVar, aq0.b bVar2, ez.a aVar) {
        this.uploadFileToCloudUC = bVar;
        this.beGetReportIncidentTypesUC = bVar2;
        this.currentTimeProvider = aVar;
    }

    private final Object e(o04.e eVar, BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration, tq.e<? super dx.i<? extends dx.b, UploadedFile>> eVar2) {
        return this.uploadFileToCloudUC.c(new p04.b.Params(wd2.a.a(bEIncidentReportFileServiceConfiguration), eVar), eVar2);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x01b5 A[Catch: Exception -> 0x01c3, c -> 0x01c7, CancellationException -> 0x01cd, TryCatch #9 {c -> 0x01c7, CancellationException -> 0x01cd, Exception -> 0x01c3, blocks: (B:44:0x01af, B:46:0x01b5, B:48:0x01bf, B:55:0x01d3, B:57:0x01e3, B:73:0x02cc), top: B:106:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01bf A[Catch: Exception -> 0x01c3, c -> 0x01c7, CancellationException -> 0x01cd, TryCatch #9 {c -> 0x01c7, CancellationException -> 0x01cd, Exception -> 0x01c3, blocks: (B:44:0x01af, B:46:0x01b5, B:48:0x01bf, B:55:0x01d3, B:57:0x01e3, B:73:0x02cc), top: B:106:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0249 A[EDGE_INSN: B:61:0x0249->B:15:0x0091 BREAK  A[LOOP:0: B:106:0x01af->B:110:0x01af]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Path cross not found for [B:102:0x0028, B:27:0x00e4], limit reached: 116 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(ae2.j.Params r26, tq.e<? super ae2.j.Result> r27) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae2.k.c(ae2.j$a, tq.e):java.lang.Object");
    }
}
