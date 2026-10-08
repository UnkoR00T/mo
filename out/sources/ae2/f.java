package ae2;

import bc4.n;
import bc4.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0012\u001a \u0012\u0004\u0012\u00020\r\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lae2/f;", "Lae2/e;", "Lbc4/n;", "pickPhotoFromGalleryUseCase", "Lbc4/p;", "transformPickedImageUC", "Lae2/a;", "copyExifDataForIncidentPhotoUC", "<init>", "(Lbc4/n;Lbc4/p;Lae2/a;)V", "Lae2/e$a;", "params", "Ldx/i;", "Ldx/b;", "", "Loq/r;", "Lwx/i$a;", "Lzd2/b;", "d", "(Lae2/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/n;", "b", "Lbc4/p;", "c", "Lae2/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p transformPickedImageUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae2.a copyExifDataForIncidentPhotoUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        int B;
        /* synthetic */ Object C;
        int E;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5545h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5546j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5547k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5548l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5549m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5550n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f5551p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f5552q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f5553r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5554s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5555t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5556v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f5557w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f5558x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f5559y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f5560z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.C = obj;
            this.E |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(n nVar, p pVar, ae2.a aVar) {
        this.pickPhotoFromGalleryUseCase = nVar;
        this.transformPickedImageUC = pVar;
        this.copyExifDataForIncidentPhotoUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x01e4 A[Catch: Exception -> 0x037b, c -> 0x037f, CancellationException -> 0x0383, TRY_LEAVE, TryCatch #11 {c -> 0x037f, CancellationException -> 0x0383, Exception -> 0x037b, blocks: (B:43:0x01de, B:45:0x01e4), top: B:130:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:50:0x026a  */
    /* JADX WARN: Code duplicated, block: B:57:0x031e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0095: MOVE (r4 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:17:0x0095 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x031e -> B:122:0x032e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(ae2.e.Params r34, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<oq.r<wx.i.Image, zd2.ImageAttachments>>>> r35) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae2.f.c(ae2.e$a, tq.e):java.lang.Object");
    }
}
