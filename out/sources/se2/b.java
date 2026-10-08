package se2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lse2/b;", "Lxw/f;", "Lse2/b$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lse2/b$a;)Lcb4/d;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: se2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lse2/b$a;", "", "Ldx/b$c;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onGoToSettingsClick", "onDismissDialog", "<init>", "(Ldx/b$c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$c;", "()Ldx/b$c;", "b", "Ler/a;", "c", "()Ler/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f181056d = dx.b.Business.f45029h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b.Business domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToSettingsClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDismissDialog;

        public Params(dx.b.Business business, er.a<i0> aVar, er.a<i0> aVar2) {
            this.domainError = business;
            this.onGoToSettingsClick = aVar;
            this.onDismissDialog = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b.Business getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> b() {
            return this.onDismissDialog;
        }

        public final er.a<i0> c() {
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
            return t.c(this.domainError, params.domainError) && t.c(this.onGoToSettingsClick, params.onGoToSettingsClick) && t.c(this.onDismissDialog, params.onDismissDialog);
        }

        public int hashCode() {
            return (((this.domainError.hashCode() * 31) + this.onGoToSettingsClick.hashCode()) * 31) + this.onDismissDialog.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", onGoToSettingsClick=" + this.onGoToSettingsClick + ", onDismissDialog=" + this.onDismissDialog + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        dx.b.Business.a type = params.getDomainError().getType();
        if (type == zb4.b.NO_FILE_PICKED || type == zb4.b.NO_PHOTO_PICKED) {
            return null;
        }
        if (type == zb4.b.NO_PERMISSIONS_GRANTED) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(ud2.a.f197768w0), this.labelProvider.c(ud2.a.f197764u0), new DialogButtonTextData(this.labelProvider.c(ud2.a.f197766v0), null, params.c(), 2, null), new DialogButtonTextData(this.labelProvider.c(ud2.a.f197725b), null, params.b(), 2, null), null, params.b(), 32, null);
        }
        Label title = params.getDomainError().getTitle();
        Label message = params.getDomainError().getMessage();
        return new DialogData(h.b.f24985a, title, message.l() ? message : null, new DialogButtonTextData(params.getDomainError().getPrimaryActionLabel(), null, params.b(), 2, null), null, null, null, 112, null);
    }
}
