package ci3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lci3/f;", "Lxw/f;", "Lci3/f$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lci3/f$a;)Lcb4/d;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ci3.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lci3/f$a;", "", "Ldx/b$c;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onGoToSettingsClick", "<init>", "(Ldx/b$c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$c;", "()Ldx/b$c;", "b", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27204c = dx.b.Business.f45029h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b.Business domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToSettingsClick;

        public Params(dx.b.Business business, er.a<i0> aVar) {
            this.domainError = business;
            this.onGoToSettingsClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b.Business getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> b() {
            return this.onGoToSettingsClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && t.c(this.onGoToSettingsClick, params.onGoToSettingsClick);
        }

        public int hashCode() {
            return (this.domainError.hashCode() * 31) + this.onGoToSettingsClick.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", onGoToSettingsClick=" + this.onGoToSettingsClick + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        dx.b.Business.a type = params.getDomainError().getType();
        if (type == zb4.b.NO_FILE_PICKED || type == zb4.b.NO_PHOTO_PICKED) {
            return null;
        }
        if (type == zb4.b.NO_PERMISSIONS_GRANTED) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.f125852w0), this.labelProvider.c(md3.b.f125836u0), new DialogButtonTextData(this.labelProvider.c(md3.b.f125844v0), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.f125699d), null, new er.a() { // from class: ci3.d
                @Override // er.a
                public final Object a() {
                    return f.h();
                }
            }, 2, null), null, null, 96, null);
        }
        Label title = params.getDomainError().getTitle();
        Label message = params.getDomainError().getMessage();
        return new DialogData(cb4.h.b.f24985a, title, message.l() ? message : null, new DialogButtonTextData(params.getDomainError().getPrimaryActionLabel(), null, new er.a() { // from class: ci3.e
            @Override // er.a
            public final Object a() {
                return f.i();
            }
        }, 2, null), null, null, null, 112, null);
    }
}
