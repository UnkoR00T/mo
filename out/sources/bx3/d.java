package bx3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import er.l;
import fr.k;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0003\u000b\r\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lbx3/d;", "Lxw/f;", "Lbx3/d$a;", "Lbx3/d$c;", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lib4/c;)V", "params", "e", "(Lbx3/d$a;)Lbx3/d$c;", "a", "Lib4/c;", "c", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lbx3/d$b;", "Ldx/b$c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b implements dx.b.Business.a {
        ML_KIT_ERROR;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ wq.a f21940c = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbx3/d$c;", "", "a", "b", "Lbx3/d$c$a;", "Lbx3/d$c$b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: bx3.d$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbx3/d$c$a;", "Lbx3/d$c;", "Lcb4/d;", "data", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogData data;

            public Dialog(DialogData dialogData) {
                this.data = dialogData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DialogData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dialog) && t.c(this.data, ((Dialog) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Dialog(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: bx3.d$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbx3/d$c$b;", "Lbx3/d$c;", "Ljb4/b;", "data", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FullPage implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b data;

            public FullPage(jb4.b bVar) {
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
                return (other instanceof FullPage) && t.c(this.data, ((FullPage) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "FullPage(data=" + this.data + ')';
            }
        }
    }

    public d(ib4.c cVar) {
        this.genericDomainErrorMapper = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ib4.c.b bVar) {
        params.e().b(bVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c b(final Params params) {
        dx.b domainError = params.getDomainError();
        dx.b.Business business = domainError instanceof dx.b.Business ? (dx.b.Business) domainError : null;
        if (business == null || business.getType() == b.ML_KIT_ERROR) {
            return new c.FullPage(this.genericDomainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, new l() { // from class: bx3.b
                @Override // er.l
                public final Object b(Object obj) {
                    return d.f(params, (ib4.c.b) obj);
                }
            }, 2, null)));
        }
        if (business.getType() == zb4.b.NO_FILE_PICKED || business.getType() == zb4.b.NO_PHOTO_PICKED) {
            return null;
        }
        return new c.Dialog(new DialogData(cb4.h.b.f24985a, business.getTitle(), business.getMessage(), new DialogButtonTextData(business.getPrimaryActionLabel(), null, params.d(), 2, null), null, null, null, 112, null));
    }

    /* JADX INFO: renamed from: bx3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lbx3/d$a;", "", "Ldx/b;", "domainError", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "Lkotlin/Function0;", "onCancelClick", "<init>", "(Ldx/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "c", "()Ldx/b;", "b", "Ler/l;", "e", "()Ler/l;", "Ler/a;", "d", "()Ler/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ib4.c.b, i0> resultAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCancelClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dx.b bVar, l<? super ib4.c.b, i0> lVar, er.a<i0> aVar) {
            this.domainError = bVar;
            this.resultAction = lVar;
            this.onCancelClick = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b() {
            return i0.f148189a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> d() {
            return this.onCancelClick;
        }

        public final l<ib4.c.b, i0> e() {
            return this.resultAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && t.c(this.resultAction, params.resultAction) && t.c(this.onCancelClick, params.onCancelClick);
        }

        public int hashCode() {
            return (((this.domainError.hashCode() * 31) + this.resultAction.hashCode()) * 31) + this.onCancelClick.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", resultAction=" + this.resultAction + ", onCancelClick=" + this.onCancelClick + ')';
        }

        public /* synthetic */ Params(dx.b bVar, l lVar, er.a aVar, int i15, k kVar) {
            this(bVar, lVar, (i15 & 4) != 0 ? new er.a() { // from class: bx3.c
                @Override // er.a
                public final Object a() {
                    return d.Params.b();
                }
            } : aVar);
        }
    }
}
