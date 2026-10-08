package zu3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import er.l;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\r\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzu3/g;", "Lxw/f;", "Lzu3/g$a;", "Lzu3/g$b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", "e", "(Lzu3/g$a;)Lzu3/g$b;", "a", "Lmx/c;", "b", "Lib4/c;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<a, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lzu3/g$a;", "", "Ldx/b;", "b", "()Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "c", "()Ler/a;", "retryAction", "a", "closeAction", "Lzu3/g$a$a;", "Lzu3/g$a$b;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zu3.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lzu3/g$a$a;", "Lzu3/g$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "retryAction", "closeAction", "onGoToSettingsClick", "<init>", "(Ldx/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "b", "()Ldx/b;", "Ler/a;", "c", "()Ler/a;", "d", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Camera implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> retryAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToSettingsClick;

            public Camera(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
                this.domainError = bVar;
                this.retryAction = aVar;
                this.closeAction = aVar2;
                this.onGoToSettingsClick = aVar3;
            }

            @Override // zu3.g.a
            public er.a<i0> a() {
                return this.closeAction;
            }

            @Override // zu3.g.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public dx.b getDomainError() {
                return this.domainError;
            }

            @Override // zu3.g.a
            public er.a<i0> c() {
                return this.retryAction;
            }

            public final er.a<i0> d() {
                return this.onGoToSettingsClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Camera)) {
                    return false;
                }
                Camera camera = (Camera) other;
                return t.c(this.domainError, camera.domainError) && t.c(this.retryAction, camera.retryAction) && t.c(this.closeAction, camera.closeAction) && t.c(this.onGoToSettingsClick, camera.onGoToSettingsClick);
            }

            public int hashCode() {
                return (((((this.domainError.hashCode() * 31) + this.retryAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.onGoToSettingsClick.hashCode();
            }

            public String toString() {
                return "Camera(domainError=" + this.domainError + ", retryAction=" + this.retryAction + ", closeAction=" + this.closeAction + ", onGoToSettingsClick=" + this.onGoToSettingsClick + ')';
            }
        }

        /* JADX INFO: renamed from: zu3.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzu3/g$a$b;", "Lzu3/g$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "retryAction", "closeAction", "<init>", "(Ldx/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "b", "()Ldx/b;", "Ler/a;", "c", "()Ler/a;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FileOrPhotoPicker implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> retryAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public FileOrPhotoPicker(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
                this.domainError = bVar;
                this.retryAction = aVar;
                this.closeAction = aVar2;
            }

            @Override // zu3.g.a
            public er.a<i0> a() {
                return this.closeAction;
            }

            @Override // zu3.g.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public dx.b getDomainError() {
                return this.domainError;
            }

            @Override // zu3.g.a
            public er.a<i0> c() {
                return this.retryAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FileOrPhotoPicker)) {
                    return false;
                }
                FileOrPhotoPicker fileOrPhotoPicker = (FileOrPhotoPicker) other;
                return t.c(this.domainError, fileOrPhotoPicker.domainError) && t.c(this.retryAction, fileOrPhotoPicker.retryAction) && t.c(this.closeAction, fileOrPhotoPicker.closeAction);
            }

            public int hashCode() {
                return (((this.domainError.hashCode() * 31) + this.retryAction.hashCode()) * 31) + this.closeAction.hashCode();
            }

            public String toString() {
                return "FileOrPhotoPicker(domainError=" + this.domainError + ", retryAction=" + this.retryAction + ", closeAction=" + this.closeAction + ')';
            }
        }

        er.a<i0> a();

        /* JADX INFO: renamed from: b */
        dx.b getDomainError();

        er.a<i0> c();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzu3/g$b;", "", "a", "b", "Lzu3/g$b$a;", "Lzu3/g$b$b;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: zu3.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzu3/g$b$a;", "Lzu3/g$b;", "Lcb4/d;", "dialogData", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogData dialogData;

            public Dialog(DialogData dialogData) {
                this.dialogData = dialogData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DialogData getDialogData() {
                return this.dialogData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dialog) && t.c(this.dialogData, ((Dialog) other).dialogData);
            }

            public int hashCode() {
                return this.dialogData.hashCode();
            }

            public String toString() {
                return "Dialog(dialogData=" + this.dialogData + ')';
            }
        }

        /* JADX INFO: renamed from: zu3.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzu3/g$b$b;", "Lzu3/g$b;", "Ljb4/b;", "data", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FullPage implements b {

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

    public g(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            aVar.a().a();
        } else {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
            aVar.c().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b b(final a params) {
        dx.b domainError = params.getDomainError();
        dx.b.Business business = domainError instanceof dx.b.Business ? (dx.b.Business) domainError : null;
        if (business == null) {
            return new b.FullPage(this.genericDomainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, new l() { // from class: zu3.f
                @Override // er.l
                public final Object b(Object obj) {
                    return g.f(params, (ib4.c.b) obj);
                }
            }, 2, null)));
        }
        if (business.getType() == zb4.b.NO_FILE_PICKED || business.getType() == zb4.b.NO_PHOTO_PICKED) {
            return null;
        }
        if (!(params instanceof a.Camera) || business.getType() != zb4.b.NO_PERMISSIONS_GRANTED) {
            return new b.Dialog(new DialogData(h.b.f24985a, business.getTitle(), business.getMessage(), new DialogButtonTextData(business.getPrimaryActionLabel(), null, params.a(), 2, null), null, null, params.a(), 48, null));
        }
        a.Camera camera = (a.Camera) params;
        return new b.Dialog(new DialogData(h.b.f24985a, this.labelProvider.c(ou3.a.f150179l), this.labelProvider.c(ou3.a.f150177j), new DialogButtonTextData(this.labelProvider.c(ou3.a.f150178k), null, camera.d(), 2, null), new DialogButtonTextData(this.labelProvider.c(ou3.a.f150168a), null, camera.a(), 2, null), null, camera.a(), 32, null));
    }
}
