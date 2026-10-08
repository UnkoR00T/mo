package l61;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll61/k;", "", "Lgz/b$a$a;", "Loq/i0;", "Lz04/a;", "fileStorageRepository", "Lk61/b;", "draftStorageRepository", "Ll61/l;", "getChildPassportApplicationDraftUC", "Lh61/a;", "childPassportApplicationContainersInteractor", "<init>", "(Lz04/a;Lk61/b;Ll61/l;Lh61/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lz04/a;", "b", "Lk61/b;", "c", "Ll61/l;", "d", "Lh61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z04.a fileStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k61.b draftStorageRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l getChildPassportApplicationDraftUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h61.a childPassportApplicationContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116415h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f116416j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f116417k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f116418l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f116419m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f116420n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f116421p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f116422q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f116423r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f116424s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f116425t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f116426v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f116427w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f116428x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f116430z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116428x = obj;
            this.f116430z |= PKIFailureInfo.systemUnavail;
            return k.this.a(null, this);
        }
    }

    public k(z04.a aVar, k61.b bVar, l lVar, h61.a aVar2) {
        this.fileStorageRepository = aVar;
        this.draftStorageRepository = bVar;
        this.getChildPassportApplicationDraftUC = lVar;
        this.childPassportApplicationContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x022f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a3 -> B:60:0x01bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x022f -> B:66:0x023b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x02cf -> B:79:0x02d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(gz.b.a.C1792a r27, tq.e<? super dx.i<? extends dx.b, oq.i0>> r28) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l61.k.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
