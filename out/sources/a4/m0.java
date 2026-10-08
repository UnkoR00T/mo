package a4;

import android.view.MotionEvent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf3/m;", "Landroidx/compose/ui/viewinterop/b;", "view", "a", "(Lf3/m;Landroidx/compose/ui/viewinterop/b;)Lf3/m;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "c", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<MotionEvent, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.b f2710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.viewinterop.b bVar) {
            super(1);
            this.f2710b = bVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f2710b.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f2710b.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final f3.m a(f3.m mVar, androidx.compose.ui.viewinterop.b bVar) {
        l0 l0Var = new l0();
        l0Var.o(new a(bVar));
        s0 s0Var = new s0();
        l0Var.p(s0Var);
        bVar.setOnRequestDisallowInterceptTouchEvent$ui(s0Var);
        return mVar.u(l0Var);
    }
}
