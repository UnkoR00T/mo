package s1;

import android.R;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import p071kotlin.Metadata;
import q1.TextContextMenuData;
import q1.TextContextMenuItem;
import q1.TextContextMenuRemoteActionItem;
import w0.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002!'B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\u0018\"\b\b\u0001\u0010\u001a*\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001c¢\u0006\u0004\b%\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010(R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006A"}, d2 = {"Ls1/k;", "Lu1/k;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Ls1/s0;", "callbackInjector", "Lkotlin/Function0;", "Le4/b0;", "coordinatesProvider", "<init>", "(Landroid/view/View;Ler/l;Ler/a;)V", "Ls1/k$b;", "session", "Lu1/j;", "dataProvider", "t", "(Ls1/k$b;Lu1/j;)Ls1/s0;", "Lq1/c;", "z", "(Lu1/j;)Lq1/c;", "Lm3/g;", "x", "(Lu1/j;)Lm3/g;", "", "T", ip.a.f96137b, "scope", "Loq/i0;", "onValueChanged", "block", "B", "(Ljava/lang/Object;Ler/l;Ler/a;)Ljava/lang/Object;", "a", "(Lu1/j;Ltq/e;)Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()V", "w", "Landroid/view/View;", "b", "Ler/l;", "c", "Ler/a;", "Lw0/b2;", "d", "Lw0/b2;", "mutatorMutex", "Lc3/m0;", "e", "Lc3/m0;", "snapshotStateObserver", "f", "onDataChange", "g", "onPositionChange", "Landroid/view/ActionMode;", "h", "Landroid/view/ActionMode;", "actionMode", "Ljava/lang/Runnable;", "i", "Ljava/lang/Runnable;", "startActionModeRunnable", "j", "finishActionModeRunnable", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements u1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<s0, s0> callbackInjector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<p036e4.b0> coordinatesProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b2 mutatorMutex = new b2();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c3.m0 snapshotStateObserver = new c3.m0(new er.l() { // from class: s1.a
        @Override // er.l
        public final Object b(Object obj) {
            return k.F(this.f177265a, (er.a) obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> onDataChange = new er.l() { // from class: s1.b
        @Override // er.l
        public final Object b(Object obj) {
            return k.D(this.f177271a, obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> onPositionChange = new er.l() { // from class: s1.c
        @Override // er.l
        public final Object b(Object obj) {
            return k.E(this.f177274a, obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ActionMode actionMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Runnable startActionModeRunnable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Runnable finishActionModeRunnable;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ls1/k$a;", "Ls1/s0;", "Lq1/g;", "session", "Lkotlin/Function0;", "Lq1/c;", "dataBuilder", "Lm3/g;", "positioner", "Landroid/view/View;", "view", "<init>", "(Lq1/g;Ler/a;Ler/a;Landroid/view/View;)V", "Landroid/view/Menu;", "menu", "", "c", "(Landroid/view/Menu;)Z", "Landroid/view/ActionMode;", "mode", "a", "(Landroid/view/ActionMode;Landroid/view/View;)Lm3/g;", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Loq/i0;", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Lq1/g;", "b", "Ler/a;", "d", "Landroid/view/View;", "e", "Lq1/c;", "previousData", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.g session;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.a<TextContextMenuData> dataBuilder;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private er.a<m3.g> positioner;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final View view;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private TextContextMenuData previousData;

        public a(q1.g gVar, er.a<TextContextMenuData> aVar, er.a<m3.g> aVar2, View view) {
            this.session = gVar;
            this.dataBuilder = aVar;
            this.positioner = aVar2;
            this.view = view;
        }

        private final boolean c(Menu menu) {
            int i15;
            TextContextMenuData textContextMenuDataA = this.dataBuilder.a();
            if (fr.t.c(textContextMenuDataA, this.previousData)) {
                return false;
            }
            menu.clear();
            List<q1.b> listB = textContextMenuDataA.b();
            int size = listB.size();
            int i16 = 1;
            int i17 = 1;
            for (int i18 = 0; i18 < size; i18++) {
                final q1.b bVar = listB.get(i18);
                if (bVar instanceof TextContextMenuItem) {
                    int i19 = i16 + 1;
                    Object key = bVar.getKey();
                    q1.e eVar = q1.e.f163557a;
                    if (fr.t.c(key, eVar.c())) {
                        i15 = R.id.cut;
                    } else if (fr.t.c(key, eVar.b())) {
                        i15 = R.id.copy;
                    } else if (fr.t.c(key, eVar.d())) {
                        i15 = R.id.paste;
                    } else if (fr.t.c(key, eVar.e())) {
                        i15 = R.id.selectAll;
                    } else {
                        i15 = fr.t.c(key, eVar.a()) ? R.id.autofill : i16;
                    }
                    MenuItem menuItemAdd = menu.add(i17, i15, i16, ((TextContextMenuItem) bVar).getLabel());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: s1.j
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return k.a.d(bVar, this, menuItem);
                        }
                    });
                    i16 = i19;
                } else if (bVar instanceof TextContextMenuRemoteActionItem) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        TextContextMenuRemoteActionItem textContextMenuRemoteActionItem = (TextContextMenuRemoteActionItem) bVar;
                        i1.f177314a.e(menu, i16, this.view.getContext(), textContextMenuRemoteActionItem.getTextClassification(), textContextMenuRemoteActionItem.getIndex());
                        i16++;
                    }
                } else if (bVar instanceof q1.f) {
                    i17++;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(q1.b bVar, a aVar, MenuItem menuItem) {
            ((TextContextMenuItem) bVar).d().b(aVar.session);
            return true;
        }

        @Override // s1.s0
        public m3.g a(ActionMode mode, View view) {
            return this.positioner.a();
        }

        @Override // s1.s0
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override // s1.s0
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            c(menu);
            return menu.size() > 0;
        }

        @Override // s1.s0
        public void onDestroyActionMode(ActionMode mode) {
            this.session.close();
        }

        @Override // s1.s0
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return c(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Ls1/k$b;", "Lq1/g;", "<init>", "()V", "Loq/i0;", "close", "a", "(Ltq/e;)Ljava/lang/Object;", "Llu/g;", "Llu/g;", "channel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b implements q1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final lu.g<oq.i0> channel = lu.j.b(0, null, null, 7, null);

        public final Object a(tq.e<? super oq.i0> eVar) {
            Object objA = this.channel.a(eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }

        @Override // q1.g
        public void close() {
            this.channel.d(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f177335e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u1.j f177337g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u1.j jVar, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f177337g = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X(k kVar, s0 s0Var, b bVar) {
            ActionMode actionModeB = e1.f177294a.b(kVar.view, s0Var);
            fr.t.c(kVar.actionMode, actionModeB);
            if (actionModeB == null) {
                bVar.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Y(k kVar) {
            ActionMode actionMode = kVar.actionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f177335e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    final b bVar = new b();
                    final s0 s0VarT = k.this.t(bVar, this.f177337g);
                    Looper looperMyLooper = Looper.myLooper();
                    Handler handler = k.this.view.getHandler();
                    if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable = k.this.startActionModeRunnable;
                        if (runnable == null) {
                            final k kVar = k.this;
                            Runnable runnable2 = new Runnable() { // from class: s1.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k.c.X(kVar, s0VarT, bVar);
                                }
                            };
                            k.this.startActionModeRunnable = runnable2;
                            runnable = runnable2;
                        }
                        vq.b.a(k.this.view.post(runnable));
                    } else {
                        k kVar2 = k.this;
                        ActionMode actionModeB = e1.f177294a.b(kVar2.view, s0VarT);
                        if (actionModeB == null) {
                            return oq.i0.f148189a;
                        }
                        kVar2.actionMode = actionModeB;
                    }
                    this.f177335e = 1;
                    if (bVar.a(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                k.this.snapshotStateObserver.f();
                Looper looperMyLooper2 = Looper.myLooper();
                Handler handler2 = k.this.view.getHandler();
                if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                    Runnable runnable3 = k.this.finishActionModeRunnable;
                    if (runnable3 == null) {
                        final k kVar3 = k.this;
                        Runnable runnable4 = new Runnable() { // from class: s1.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.c.Y(kVar3);
                            }
                        };
                        k.this.finishActionModeRunnable = runnable4;
                        runnable3 = runnable4;
                    }
                    vq.b.a(k.this.view.post(runnable3));
                } else {
                    ActionMode actionMode = k.this.actionMode;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                }
                Runnable runnable5 = k.this.startActionModeRunnable;
                if (runnable5 != null) {
                    vq.b.a(k.this.view.removeCallbacks(runnable5));
                }
                k.this.actionMode = null;
                return oq.i0.f148189a;
            } catch (Throwable th4) {
                k.this.snapshotStateObserver.f();
                Looper looperMyLooper3 = Looper.myLooper();
                Handler handler3 = k.this.view.getHandler();
                if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                    Runnable runnable6 = k.this.finishActionModeRunnable;
                    if (runnable6 == null) {
                        final k kVar4 = k.this;
                        Runnable runnable7 = new Runnable() { // from class: s1.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.c.Y(kVar4);
                            }
                        };
                        k.this.finishActionModeRunnable = runnable7;
                        runnable6 = runnable7;
                    }
                    vq.b.a(k.this.view.post(runnable6));
                } else {
                    ActionMode actionMode2 = k.this.actionMode;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                }
                Runnable runnable8 = k.this.startActionModeRunnable;
                if (runnable8 != null) {
                    vq.b.a(k.this.view.removeCallbacks(runnable8));
                }
                k.this.actionMode = null;
                throw th4;
            }
        }

        public final tq.e<oq.i0> O(tq.e<?> eVar) {
            return k.this.new c(this.f177337g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) O(eVar)).J(oq.i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(View view, er.l<? super s0, ? extends s0> lVar, er.a<? extends p036e4.b0> aVar) {
        this.view = view;
        this.callbackInjector = lVar;
        this.coordinatesProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData A(u1.j jVar) {
        return jVar.A0();
    }

    private final <T, S> T B(S scope, er.l<? super S, oq.i0> onValueChanged, final er.a<? extends T> block) {
        final fr.p0 p0Var = new fr.p0();
        this.snapshotStateObserver.k(scope, onValueChanged, new er.a() { // from class: s1.i
            @Override // er.a
            public final Object a() {
                return k.C(p0Var, block);
            }
        });
        T t15 = p0Var.f66410a;
        return t15 == null ? (T) oq.i0.f148189a : t15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final oq.i0 C(fr.p0 p0Var, er.a aVar) {
        p0Var.f66410a = aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(k kVar, Object obj) {
        ActionMode actionMode = kVar.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(k kVar, Object obj) {
        ActionMode actionMode = kVar.actionMode;
        if (actionMode != null) {
            e1.f177294a.a(actionMode);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(k kVar, final er.a aVar) {
        Handler handler = kVar.view.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.a();
        } else {
            Handler handler2 = kVar.view.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: s1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.G(aVar);
                    }
                });
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(er.a aVar) {
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 t(b session, final u1.j dataProvider) {
        s0 s0VarB;
        a aVar = new a(session, new er.a() { // from class: s1.d
            @Override // er.a
            public final Object a() {
                return k.u(this.f177280a, dataProvider);
            }
        }, new er.a() { // from class: s1.e
            @Override // er.a
            public final Object a() {
                return k.v(this.f177289a, dataProvider);
            }
        }, this.view);
        er.l<s0, s0> lVar = this.callbackInjector;
        return (lVar == null || (s0VarB = lVar.b(aVar)) == null) ? aVar : s0VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData u(k kVar, u1.j jVar) {
        return kVar.z(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.g v(k kVar, u1.j jVar) {
        return kVar.x(jVar);
    }

    private final m3.g x(final u1.j dataProvider) {
        return (m3.g) B("positioner", this.onPositionChange, new er.a() { // from class: s1.h
            @Override // er.a
            public final Object a() {
                return k.y(this.f177304a, dataProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.g y(k kVar, u1.j jVar) {
        p036e4.b0 b0VarA = kVar.coordinatesProvider.a();
        if (!b0VarA.c()) {
            b0VarA = null;
        }
        p036e4.b0 b0Var = b0VarA;
        return b0Var == null ? m3.g.INSTANCE.a() : jVar.S0(b0Var).u(p036e4.c0.g(b0Var));
    }

    private final TextContextMenuData z(final u1.j dataProvider) {
        return (TextContextMenuData) B("dataBuilder", this.onDataChange, new er.a() { // from class: s1.g
            @Override // er.a
            public final Object a() {
                return k.A(dataProvider);
            }
        });
    }

    public final void H() {
        this.snapshotStateObserver.q();
    }

    @Override // u1.k
    public Object a(u1.j jVar, tq.e<? super oq.i0> eVar) {
        Object objE = b2.e(this.mutatorMutex, null, new c(jVar, null), eVar, 1, null);
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }

    public final void w() {
        this.snapshotStateObserver.r();
        this.snapshotStateObserver.f();
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }
}
