package dd4;

import ch1.b0;
import fr.t;
import i34.IdentityDeactivateData;
import jb4.ErrorActionData;
import k34.DeleteCert;
import k34.u;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.mc.fringers.mobywatel.f0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ldd4/j;", "Lib4/a;", "Lmx/c;", "labelProvider", "Lgx/d;", "globalEventManager", "Lch1/b0;", "getRenewDocumentByIdentityTypeGlobalEventUC", "<init>", "(Lmx/c;Lgx/d;Lch1/b0;)V", "Ldx/b;", "Li34/b;", "m", "(Ldx/b;)Li34/b;", "Ldd4/j$a;", "l", "(Li34/b;)Ldd4/j$a;", "Lib4/a$a;", "params", "Ljb4/b;", "q", "(Lib4/a$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lgx/d;", "c", "Lch1/b0;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements ib4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0 getRenewDocumentByIdentityTypeGlobalEventUC;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dd4.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006\""}, d2 = {"Ldd4/j$a;", "", "Li34/b;", "data", "", "title", "description", "primaryButton", "secondaryButton", "<init>", "(Li34/b;IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li34/b;", "getData", "()Li34/b;", "b", "I", "e", "c", "d", "Lk34/u;", "f", "Lk34/u;", "()Lk34/u;", "identityType", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final /* data */ class DeactivatedCert {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdentityDeactivateData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int primaryButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int secondaryButton;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final u identityType;

        public DeactivatedCert(IdentityDeactivateData identityDeactivateData, int i15, int i16, int i17, int i18) {
            this.data = identityDeactivateData;
            this.title = i15;
            this.description = i16;
            this.primaryButton = i17;
            this.secondaryButton = i18;
            this.identityType = identityDeactivateData.getIdentityType();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final u getIdentityType() {
            return this.identityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeactivatedCert)) {
                return false;
            }
            DeactivatedCert deactivatedCert = (DeactivatedCert) other;
            return t.c(this.data, deactivatedCert.data) && this.title == deactivatedCert.title && this.description == deactivatedCert.description && this.primaryButton == deactivatedCert.primaryButton && this.secondaryButton == deactivatedCert.secondaryButton;
        }

        public int hashCode() {
            return (((((((this.data.hashCode() * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.description)) * 31) + Integer.hashCode(this.primaryButton)) * 31) + Integer.hashCode(this.secondaryButton);
        }

        public String toString() {
            return "DeactivatedCert(data=" + this.data + ", title=" + this.title + ", description=" + this.description + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41083a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.STUDENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41083a = iArr;
        }
    }

    public j(mx.c cVar, gx.d dVar, b0 b0Var) {
        this.labelProvider = cVar;
        this.globalEventManager = dVar;
        this.getRenewDocumentByIdentityTypeGlobalEventUC = b0Var;
    }

    private final DeactivatedCert l(IdentityDeactivateData identityDeactivateData) {
        int i15 = b.f41083a[identityDeactivateData.getIdentityType().ordinal()];
        if (i15 == 1) {
            return new DeactivatedCert(identityDeactivateData, f0.N, f0.M, f0.f160700b, f0.K);
        }
        if (i15 != 2) {
            return null;
        }
        return new DeactivatedCert(identityDeactivateData, f0.P, f0.O, f0.D, f0.L);
    }

    private final IdentityDeactivateData m(dx.b bVar) {
        if (!(bVar instanceof dx.b.Deactivate)) {
            return null;
        }
        dx.b.Deactivate deactivate = (dx.b.Deactivate) bVar;
        if (deactivate.getData() instanceof IdentityDeactivateData) {
            return (IdentityDeactivateData) deactivate.getData();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(j jVar, DeactivatedCert deactivatedCert) {
        jVar.globalEventManager.c(jVar.getRenewDocumentByIdentityTypeGlobalEventUC.a(new b0.Params(deactivatedCert.getIdentityType(), false, 2, null)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(j jVar, DeactivatedCert deactivatedCert) {
        jVar.globalEventManager.c(new DeleteCert(deactivatedCert.getIdentityType()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(j jVar) {
        jVar.globalEventManager.c(new tg1.a.ToDashboard(true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(j jVar) {
        jVar.globalEventManager.c(new tg1.a.ToDashboard(true));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public jb4.b b(ib4.a.Params params) {
        IdentityDeactivateData identityDeactivateDataM = m(params.getDeactivateDomainError());
        final DeactivatedCert deactivatedCertL = identityDeactivateDataM != null ? l(identityDeactivateDataM) : null;
        if (identityDeactivateDataM != null && !identityDeactivateDataM.getHasAnyCertActive()) {
            this.globalEventManager.c(new tg1.a.ToDashboard(true));
            return jb4.b.a.f101356a;
        }
        if (deactivatedCertL != null) {
            return new jb4.b.Failure(this.labelProvider.c(deactivatedCertL.getTitle()), this.labelProvider.c(deactivatedCertL.getDescription()), null, new ErrorActionData(this.labelProvider.c(deactivatedCertL.getPrimaryButton()), new er.a() { // from class: dd4.e
                @Override // er.a
                public final Object a() {
                    return j.r(this.f41068a, deactivatedCertL);
                }
            }), new ErrorActionData(this.labelProvider.c(deactivatedCertL.getSecondaryButton()), new er.a() { // from class: dd4.g
                @Override // er.a
                public final Object a() {
                    return j.u(this.f41070a, deactivatedCertL);
                }
            }), null, new ErrorActionData(null, new er.a() { // from class: dd4.f
                @Override // er.a
                public final Object a() {
                    return j.s();
                }
            }, 1, null), 36, null);
        }
        return new jb4.b.Failure(this.labelProvider.c(f0.f160722m), null, null, new ErrorActionData(this.labelProvider.c(f0.f160716j), new er.a() { // from class: dd4.h
            @Override // er.a
            public final Object a() {
                return j.v(this.f41072a);
            }
        }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: dd4.i
            @Override // er.a
            public final Object a() {
                return j.x(this.f41073a);
            }
        }), 54, null);
    }
}
