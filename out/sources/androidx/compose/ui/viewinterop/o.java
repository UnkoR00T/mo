package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.j3;
import b3.r;
import fr.w;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,RB\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103RB\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103RB\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\u0014\u0010>\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/ui/viewinterop/o;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/b;", "Landroidx/compose/ui/platform/j3;", "Landroid/content/Context;", "context", "Lm2/v;", "parentContext", "typedView", "Lz3/b;", "dispatcher", "Lb3/r;", "saveStateRegistry", "", "compositeKeyHash", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Lm2/v;Landroid/view/View;Lz3/b;Lb3/r;ILandroidx/compose/ui/node/Owner;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Ler/l;Lm2/v;Lb3/r;ILandroidx/compose/ui/node/Owner;)V", "Loq/i0;", "J", "()V", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Landroid/view/View;", "I", "Lz3/b;", "getDispatcher", "()Lz3/b;", "Lb3/r;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "", "O", "Ljava/lang/String;", "saveStateKey", "Lb3/r$a;", "value", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Lb3/r$a;", "setSavableRegistryEntry", "(Lb3/r$a;)V", "savableRegistryEntry", "R", "Ler/l;", "getUpdateBlock", "()Ler/l;", "setUpdateBlock", "(Ler/l;)V", "updateBlock", "getResetBlock", "setResetBlock", "resetBlock", "h0", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o<T extends View> extends androidx.compose.ui.viewinterop.b implements j3 {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final T typedView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final z3.b dispatcher;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final r saveStateRegistry;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final String saveStateKey;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private r.a savableRegistryEntry;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private er.l<? super T, i0> updateBlock;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private er.l<? super T, i0> resetBlock;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private er.l<? super T, i0> releaseBlock;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f11021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o<T> oVar) {
            super(0);
            this.f11021b = oVar;
        }

        @Override // er.a
        public final Object a() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((o) this.f11021b).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f11022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o<T> oVar) {
            super(0);
            this.f11022b = oVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f11022b.getReleaseBlock().b(((o) this.f11022b).typedView);
            this.f11022b.K();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f11023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o<T> oVar) {
            super(0);
            this.f11023b = oVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f11023b.getResetBlock().b(((o) this.f11023b).typedView);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f11024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o<T> oVar) {
            super(0);
            this.f11024b = oVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f11024b.getUpdateBlock().b(((o) this.f11024b).typedView);
        }
    }

    private o(Context context, v vVar, T t15, z3.b bVar, r rVar, int i15, Owner owner) {
        super(context, vVar, i15, bVar, t15, owner);
        this.typedView = t15;
        this.dispatcher = bVar;
        this.saveStateRegistry = rVar;
        this.compositeKeyHash = i15;
        setClipChildren(false);
        String strValueOf = String.valueOf(i15);
        this.saveStateKey = strValueOf;
        Object objF = rVar != null ? rVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            t15.restoreHierarchyState(sparseArray);
        }
        J();
        this.updateBlock = e.e();
        this.resetBlock = e.e();
        this.releaseBlock = e.e();
    }

    private final void J() {
        r rVar = this.saveStateRegistry;
        if (rVar != null) {
            setSavableRegistryEntry(rVar.c(this.saveStateKey, new a(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(r.a aVar) {
        r.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    public final z3.b getDispatcher() {
        return this.dispatcher;
    }

    public final er.l<T, i0> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final er.l<T, i0> getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.j3
    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.b getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final er.l<T, i0> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.j3
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(er.l<? super T, i0> lVar) {
        this.releaseBlock = lVar;
        setRelease(new b(this));
    }

    public final void setResetBlock(er.l<? super T, i0> lVar) {
        this.resetBlock = lVar;
        setReset(new c(this));
    }

    public final void setUpdateBlock(er.l<? super T, i0> lVar) {
        this.updateBlock = lVar;
        setUpdate(new d(this));
    }

    /* synthetic */ o(Context context, v vVar, View view, z3.b bVar, r rVar, int i15, Owner owner, int i16, fr.k kVar) {
        this(context, (i16 & 2) != 0 ? null : vVar, view, (i16 & 8) != 0 ? new z3.b() : bVar, rVar, i15, owner);
    }

    public o(Context context, er.l<? super Context, ? extends T> lVar, v vVar, r rVar, int i15, Owner owner) {
        this(context, vVar, lVar.b(context), null, rVar, i15, owner, 8, null);
    }
}
