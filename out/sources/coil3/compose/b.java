package coil3.compose;

import gu.e;
import p036e4.l;
import p071kotlin.Metadata;
import zc.SuccessResult;
import zc.h;
import zc.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\b\u001a)\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State;", "previous", "current", "Le4/l;", "contentScale", "Lcoil3/compose/CrossfadePainter;", "a", "(Lcoil3/compose/AsyncImagePainter$State;Lcoil3/compose/AsyncImagePainter$State;Le4/l;)Lcoil3/compose/CrossfadePainter;", "coil3/compose/b$a", "Lcoil3/compose/b$a;", "FakeTransitionTarget", "coil-compose-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f28711a = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil3/compose/b$a", "Ldd/d;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements dd.d {
        a() {
        }
    }

    public static final CrossfadePainter a(AsyncImagePainter.State state, AsyncImagePainter.State state2, l lVar) {
        i result;
        if (!(state2 instanceof AsyncImagePainter.State.Success)) {
            if (state2 instanceof AsyncImagePainter.State.Error) {
                result = ((AsyncImagePainter.State.Error) state2).getResult();
            }
            return null;
        }
        result = ((AsyncImagePainter.State.Success) state2).getResult();
        dd.c cVarA = h.k(result.getRequest()).a(f28711a, result);
        if (cVarA instanceof dd.a) {
            androidx.compose.ui.graphics.painter.a painter = state instanceof AsyncImagePainter.State.Loading ? state.getPainter() : null;
            androidx.compose.ui.graphics.painter.a painter2 = state2.getPainter();
            gu.b.Companion companion = gu.b.INSTANCE;
            dd.a aVar = (dd.a) cVarA;
            return new CrossfadePainter(painter, painter2, lVar, gu.d.q(aVar.b(), e.MILLISECONDS), null, ((result instanceof SuccessResult) && ((SuccessResult) result).getIsPlaceholderCached()) ? false : true, aVar.c(), lc.h.a(result.getRequest()), 16, null);
        }
        return null;
    }
}
