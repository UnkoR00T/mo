package wd2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwd2/b;", "", "<init>", "()V", "Lmx/c;", "labelProvider", "Lkotlin/Function0;", "Loq/i0;", "onGoToSettings", "onClose", "Lcb4/d;", "b", "(Lmx/c;Ler/a;Ler/a;)Lcb4/d;", "goToLocationSettings", "a", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f212472a = new b();

    private b() {
    }

    public final DialogData a(c labelProvider, er.a<i0> goToLocationSettings, er.a<i0> onClose) {
        return new DialogData(h.b.f24985a, labelProvider.c(ud2.a.C0), labelProvider.c(ud2.a.B0), new DialogButtonTextData(labelProvider.c(ud2.a.f197770x0), null, goToLocationSettings, 2, null), new DialogButtonTextData(labelProvider.c(ud2.a.f197725b), cb4.a.C0668a.f24967a, onClose), null, onClose, 32, null);
    }

    public final DialogData b(c labelProvider, er.a<i0> onGoToSettings, er.a<i0> onClose) {
        return new DialogData(h.b.f24985a, labelProvider.c(ud2.a.f197774z0), labelProvider.c(ud2.a.L), new DialogButtonTextData(labelProvider.c(ud2.a.f197770x0), null, onGoToSettings, 2, null), new DialogButtonTextData(labelProvider.c(ud2.a.f197725b), cb4.a.C0668a.f24967a, onClose), null, onClose, 32, null);
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof b);
    }

    public int hashCode() {
        return 348982786;
    }

    public String toString() {
        return "LocalizationDialogMapper";
    }
}
