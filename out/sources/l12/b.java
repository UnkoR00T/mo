package l12;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.k;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll12/b;", "Lxw/f;", "Ll12/b$b;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Ll12/b$b;)Lcb4/d;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f114232b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f114233c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll12/b$a;", "", "<init>", "()V", "", "ATTACHMENT_MAX_SIZE", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: l12.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll12/b$b;", "", "Lkotlin/Function0;", "Loq/i0;", "openEdorInBrowser", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openEdorInBrowser;

        public Params(er.a<i0> aVar) {
            this.openEdorInBrowser = aVar;
        }

        public final er.a<i0> a() {
            return this.openEdorInBrowser;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.openEdorInBrowser, ((Params) other).openEdorInBrowser);
        }

        public int hashCode() {
            return this.openEdorInBrowser.hashCode();
        }

        public String toString() {
            return "Params(openEdorInBrowser=" + this.openEdorInBrowser + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(e02.a.f46500a3), this.labelProvider.e(e02.a.Z2, "50 MB"), new DialogButtonTextData(this.labelProvider.c(e02.a.f46532g), null, new er.a() { // from class: l12.a
            @Override // er.a
            public final Object a() {
                return b.f();
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(e02.a.f46560k3), null, params.a(), 2, null), null, null, 96, null);
    }
}
