package i50;

import android.view.KeyEvent;
import d60.ScrollControllerData;
import java.util.List;
import java.util.Map;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v0;
import r70.BaseFloatingActionButtonData;

/* JADX INFO: renamed from: i50.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013BC\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b#\u0010-R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b'\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b+\u00104¨\u00065"}, d2 = {"Li50/a;", "", "Li50/a$a;", "topAppBarScrollBehavior", "Lx50/i;", "topMenuData", "", "Lr70/a;", "floatingActionButtonData", "", "Ly3/a;", "Lkotlin/Function0;", "Loq/i0;", "onKeyActions", "Lmx/a;", "paneTitle", "Ld60/g;", "scrollControllerData", "<init>", "(Li50/a$a;Lx50/i;Ljava/util/List;Ljava/util/Map;Lmx/a;Ld60/g;)V", "(Li50/a$a;Lx50/i;Lr70/a;Lmx/a;Ld60/g;)V", "Ly3/b;", "keyEvent", "", "f", "(Landroid/view/KeyEvent;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a$a;", "d", "()Li50/a$a;", "b", "Lx50/i;", "e", "()Lx50/i;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/util/Map;", "getOnKeyActions", "()Ljava/util/Map;", "Lmx/a;", "()Lmx/a;", "Ld60/g;", "()Ld60/g;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaseScaffoldData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f89350g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC2111a topAppBarScrollBehavior;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final x50.i topMenuData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BaseFloatingActionButtonData> floatingActionButtonData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<y3.a, er.a<i0>> onKeyActions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label paneTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScrollControllerData<?> scrollControllerData;

    /* JADX INFO: renamed from: i50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Li50/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC2111a {
        PinnedScroll,
        EnterAlwaysScroll,
        ExitUntilCollapsedScroll;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f89361e = wq.b.a(b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseScaffoldData(EnumC2111a enumC2111a, x50.i iVar, List<BaseFloatingActionButtonData> list, Map<y3.a, ? extends er.a<i0>> map, Label label, ScrollControllerData<?> scrollControllerData) {
        this.topAppBarScrollBehavior = enumC2111a;
        this.topMenuData = iVar;
        this.floatingActionButtonData = list;
        this.onKeyActions = map;
        this.paneTitle = label;
        this.scrollControllerData = scrollControllerData;
    }

    public final List<BaseFloatingActionButtonData> a() {
        return this.floatingActionButtonData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getPaneTitle() {
        return this.paneTitle;
    }

    public final ScrollControllerData<?> c() {
        return this.scrollControllerData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC2111a getTopAppBarScrollBehavior() {
        return this.topAppBarScrollBehavior;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final x50.i getTopMenuData() {
        return this.topMenuData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseScaffoldData)) {
            return false;
        }
        BaseScaffoldData baseScaffoldData = (BaseScaffoldData) other;
        return this.topAppBarScrollBehavior == baseScaffoldData.topAppBarScrollBehavior && fr.t.c(this.topMenuData, baseScaffoldData.topMenuData) && fr.t.c(this.floatingActionButtonData, baseScaffoldData.floatingActionButtonData) && fr.t.c(this.onKeyActions, baseScaffoldData.onKeyActions) && fr.t.c(this.paneTitle, baseScaffoldData.paneTitle) && fr.t.c(this.scrollControllerData, baseScaffoldData.scrollControllerData);
    }

    public final boolean f(KeyEvent keyEvent) {
        er.a<i0> aVar = this.onKeyActions.get(y3.a.O(y3.d.a(keyEvent)));
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    public int hashCode() {
        int iHashCode = this.topAppBarScrollBehavior.hashCode() * 31;
        x50.i iVar = this.topMenuData;
        int iHashCode2 = (((((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.floatingActionButtonData.hashCode()) * 31) + this.onKeyActions.hashCode()) * 31;
        Label label = this.paneTitle;
        int iHashCode3 = (iHashCode2 + (label == null ? 0 : label.hashCode())) * 31;
        ScrollControllerData<?> scrollControllerData = this.scrollControllerData;
        return iHashCode3 + (scrollControllerData != null ? scrollControllerData.hashCode() : 0);
    }

    public String toString() {
        return "BaseScaffoldData(topAppBarScrollBehavior=" + this.topAppBarScrollBehavior + ", topMenuData=" + this.topMenuData + ", floatingActionButtonData=" + this.floatingActionButtonData + ", onKeyActions=" + this.onKeyActions + ", paneTitle=" + this.paneTitle + ", scrollControllerData=" + this.scrollControllerData + ')';
    }

    public /* synthetic */ BaseScaffoldData(EnumC2111a enumC2111a, x50.i iVar, List list, Map map, Label label, ScrollControllerData scrollControllerData, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? EnumC2111a.PinnedScroll : enumC2111a, (i15 & 2) != 0 ? null : iVar, (i15 & 4) != 0 ? pq.v.n() : list, (i15 & 8) != 0 ? v0.i() : map, (i15 & 16) != 0 ? null : label, (i15 & 32) != 0 ? null : scrollControllerData);
    }

    public /* synthetic */ BaseScaffoldData(EnumC2111a enumC2111a, x50.i iVar, BaseFloatingActionButtonData aVar, Label label, ScrollControllerData scrollControllerData, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? EnumC2111a.PinnedScroll : enumC2111a, (i15 & 2) != 0 ? null : iVar, aVar, (i15 & 8) != 0 ? null : label, (i15 & 16) != 0 ? null : scrollControllerData);
    }

    public BaseScaffoldData(EnumC2111a enumC2111a, x50.i iVar, BaseFloatingActionButtonData aVar, Label label, ScrollControllerData<?> scrollControllerData) {
        this(enumC2111a, iVar, pq.v.e(aVar), null, label, scrollControllerData, 8, null);
    }
}
