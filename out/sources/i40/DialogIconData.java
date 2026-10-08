package i40;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: renamed from: i40.f, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Li40/f;", "", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "<init>", "(ILer/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DialogIconData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89047c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, Integer, Color> iconColorProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogIconData(int i15, p<? super r, ? super Integer, Color> pVar) {
        this.iconResId = i15;
        this.iconColorProvider = pVar;
    }

    public final p<r, Integer, Color> a() {
        return this.iconColorProvider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogIconData)) {
            return false;
        }
        DialogIconData dialogIconData = (DialogIconData) other;
        return this.iconResId == dialogIconData.iconResId && t.c(this.iconColorProvider, dialogIconData.iconColorProvider);
    }

    public int hashCode() {
        return (Integer.hashCode(this.iconResId) * 31) + this.iconColorProvider.hashCode();
    }

    public String toString() {
        return "DialogIconData(iconResId=" + this.iconResId + ", iconColorProvider=" + this.iconColorProvider + ')';
    }
}
