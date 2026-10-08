package g70;

import er.l;
import fr.t;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g70.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R)\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg70/a;", "", "Lmx/a;", "text", "Lkotlin/Function1;", "", "Lg70/b;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ler/l;", "()Ler/l;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShortcutMoreData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<List<ShortcutMoreTransferData>, i0> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutMoreData(Label label, l<? super List<ShortcutMoreTransferData>, i0> lVar) {
        this.text = label;
        this.onClick = lVar;
    }

    public final l<List<ShortcutMoreTransferData>, i0> a() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutMoreData)) {
            return false;
        }
        ShortcutMoreData shortcutMoreData = (ShortcutMoreData) other;
        return t.c(this.text, shortcutMoreData.text) && t.c(this.onClick, shortcutMoreData.onClick);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "ShortcutMoreData(text=" + this.text + ", onClick=" + this.onClick + ')';
    }
}
