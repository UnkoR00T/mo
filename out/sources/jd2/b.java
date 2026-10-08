package jd2;

import er.l;
import fr.k;
import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;
import zc2.ProhibitedAccessData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0015\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljd2/b;", "Lxw/f;", "Ljd2/b$b;", "Ljd2/b$c;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "Ljb4/f;", "e", "(Ldx/b;)Ljb4/f;", "params", "f", "(Ljd2/b$b;)Ljd2/b$c;", "a", "Lmx/c;", "b", "Lib4/c;", "c", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<InterfaceC2409b, c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f101900c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101901d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ljd2/b$a;", "", "<init>", "()V", "", "BUSINESS_CODE_UNACCEPTABLE_AGE", "Ljava/lang/String;", "BUSINESS_CODE_MISSING_ID_CARD_ELECTRONIC_LAYER", "BUSINESS_CODE_PHYSICAL_ID_CARD_INVALIDATED", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: jd2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ljd2/b$b;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "closeAction", "b", "Ljd2/b$b$a;", "Ljd2/b$b$b;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2409b {

        /* JADX INFO: renamed from: jd2.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljd2/b$b$a;", "Ljd2/b$b;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "retryAction", "closeAction", "<init>", "(Ldx/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "b", "()Ldx/b;", "Ler/a;", "c", "()Ler/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Generic implements InterfaceC2409b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> retryAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public Generic(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
                this.domainError = bVar;
                this.retryAction = aVar;
                this.closeAction = aVar2;
            }

            @Override // jd2.b.InterfaceC2409b
            public er.a<i0> a() {
                return this.closeAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final dx.b getDomainError() {
                return this.domainError;
            }

            public final er.a<i0> c() {
                return this.retryAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) other;
                return t.c(this.domainError, generic.domainError) && t.c(this.retryAction, generic.retryAction) && t.c(this.closeAction, generic.closeAction);
            }

            public int hashCode() {
                return (((this.domainError.hashCode() * 31) + this.retryAction.hashCode()) * 31) + this.closeAction.hashCode();
            }

            public String toString() {
                return "Generic(domainError=" + this.domainError + ", retryAction=" + this.retryAction + ", closeAction=" + this.closeAction + ')';
            }
        }

        /* JADX INFO: renamed from: jd2.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljd2/b$b$b;", "Ljd2/b$b;", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MissingTrustedProfile implements InterfaceC2409b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public MissingTrustedProfile(er.a<i0> aVar) {
                this.closeAction = aVar;
            }

            @Override // jd2.b.InterfaceC2409b
            public er.a<i0> a() {
                return this.closeAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MissingTrustedProfile) && t.c(this.closeAction, ((MissingTrustedProfile) other).closeAction);
            }

            public int hashCode() {
                return this.closeAction.hashCode();
            }

            public String toString() {
                return "MissingTrustedProfile(closeAction=" + this.closeAction + ')';
            }
        }

        er.a<i0> a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ljd2/b$c;", "", "a", "b", "Ljd2/b$c$a;", "Ljd2/b$c$b;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: jd2.b$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljd2/b$c$a;", "Ljd2/b$c;", "Ljb4/b;", "data", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b data;

            public Error(jb4.b bVar) {
                this.data = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jb4.b getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && t.c(this.data, ((Error) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Error(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: jd2.b$c$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljd2/b$c$b;", "Ljd2/b$c;", "Lzc2/e;", "data", "<init>", "(Lzc2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzc2/e;", "()Lzc2/e;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProhibitedAccess implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProhibitedAccessData data;

            public ProhibitedAccess(ProhibitedAccessData prohibitedAccessData) {
                this.data = prohibitedAccessData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ProhibitedAccessData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProhibitedAccess) && t.c(this.data, ((ProhibitedAccess) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "ProhibitedAccess(data=" + this.data + ')';
            }
        }
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    private final PayloadErrorData e(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(InterfaceC2409b interfaceC2409b, ib4.c.b bVar) {
        if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            interfaceC2409b.a().a();
        } else if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            ((InterfaceC2409b.Generic) interfaceC2409b).c().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c b(final InterfaceC2409b params) {
        int iHashCode;
        Label labelC;
        if (!(params instanceof InterfaceC2409b.Generic)) {
            if (!(params instanceof InterfaceC2409b.MissingTrustedProfile)) {
                throw new p();
            }
            InterfaceC2409b.MissingTrustedProfile missingTrustedProfile = (InterfaceC2409b.MissingTrustedProfile) params;
            return new c.Error(new jb4.b.Warning(this.labelProvider.c(uc2.a.f197471e), this.labelProvider.c(uc2.a.f197475i), null, new ErrorActionData(this.labelProvider.c(uc2.a.f197467a), missingTrustedProfile.a()), null, null, new ErrorActionData(null, missingTrustedProfile.a(), 1, null), 52, null));
        }
        InterfaceC2409b.Generic generic = (InterfaceC2409b.Generic) params;
        dx.b domainError = generic.getDomainError();
        dx.b.g.Http http = domainError instanceof dx.b.g.Http ? (dx.b.g.Http) domainError : null;
        PayloadErrorData payloadErrorDataE = http != null ? e(http) : null;
        String code = payloadErrorDataE != null ? payloadErrorDataE.getCode() : null;
        if (code == null || ((iHashCode = code.hashCode()) == -2005256270 ? !code.equals("MISSING_ID_CARD_ELECTRONIC_LAYER") : !(iHashCode == -1214338981 ? code.equals("UNACCEPTABLE_AGE") : iHashCode == 2109678326 && code.equals("PHYSICAL_ID_CARD_INVALIDATED")))) {
            return new c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(generic.getDomainError(), false, new l() { // from class: jd2.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.h(params, (ib4.c.b) obj);
                }
            }, 2, null)));
        }
        String title = payloadErrorDataE.getTitle();
        if (title == null || (labelC = mx.b.b(title, "title")) == null) {
            labelC = this.labelProvider.c(uc2.a.f197470d);
        }
        String message = payloadErrorDataE.getMessage();
        return new c.ProhibitedAccess(new ProhibitedAccessData(labelC, message != null ? mx.b.b(message, "message") : null));
    }
}
