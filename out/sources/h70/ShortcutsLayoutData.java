package h70;

import fr.t;
import g70.ShortcutMoreData;
import java.util.List;
import o50.SmallCardData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h70.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lh70/a;", "", "", "Lo50/a;", "shortcuts", "Lg70/a;", "moreShortcut", "<init>", "(Ljava/util/List;Lg70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lg70/a;", "()Lg70/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShortcutsLayoutData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81324c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SmallCardData> shortcuts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShortcutMoreData moreShortcut;

    public ShortcutsLayoutData(List<SmallCardData> list, ShortcutMoreData shortcutMoreData) {
        this.shortcuts = list;
        this.moreShortcut = shortcutMoreData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ShortcutMoreData getMoreShortcut() {
        return this.moreShortcut;
    }

    public final List<SmallCardData> b() {
        return this.shortcuts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutsLayoutData)) {
            return false;
        }
        ShortcutsLayoutData shortcutsLayoutData = (ShortcutsLayoutData) other;
        return t.c(this.shortcuts, shortcutsLayoutData.shortcuts) && t.c(this.moreShortcut, shortcutsLayoutData.moreShortcut);
    }

    public int hashCode() {
        return (this.shortcuts.hashCode() * 31) + this.moreShortcut.hashCode();
    }

    public String toString() {
        return "ShortcutsLayoutData(shortcuts=" + this.shortcuts + ", moreShortcut=" + this.moreShortcut + ')';
    }
}
