package e2;

import android.content.Context;
import android.view.ViewGroup;
import f3.p;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Le2/d;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "Loq/i0;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Le2/e;", "Le2/h;", "(Le2/e;)Le2/h;", "a", "(Le2/e;)V", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "c", "unusedRippleHosts", "Le2/f;", "d", "Le2/f;", "rippleHostMap", "e", "nextHostIndex", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<h> rippleHosts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<h> unusedRippleHosts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f rippleHostMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    public d(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new f();
        setClipChildren(false);
        h hVar = new h(context);
        addView(hVar);
        arrayList.add(hVar);
        arrayList2.add(hVar);
        this.nextHostIndex = 1;
        setTag(p.L, Boolean.TRUE);
    }

    public final void a(e eVar) {
        eVar.G();
        h hVarB = this.rippleHostMap.b(eVar);
        if (hVarB != null) {
            hVarB.d();
            this.rippleHostMap.c(eVar);
            this.unusedRippleHosts.add(hVarB);
        }
    }

    public final h b(e eVar) {
        h hVarB = this.rippleHostMap.b(eVar);
        if (hVarB != null) {
            return hVarB;
        }
        h hVar = (h) v.L(this.unusedRippleHosts);
        if (hVar == null) {
            if (this.nextHostIndex > v.p(this.rippleHosts)) {
                hVar = new h(getContext());
                addView(hVar);
                this.rippleHosts.add(hVar);
            } else {
                hVar = this.rippleHosts.get(this.nextHostIndex);
                e eVarA = this.rippleHostMap.a(hVar);
                if (eVarA != null) {
                    eVarA.G();
                    this.rippleHostMap.c(eVarA);
                    hVar.d();
                }
            }
            int i15 = this.nextHostIndex;
            if (i15 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i15 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(eVar, hVar);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l15, int t15, int r15, int b15) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
