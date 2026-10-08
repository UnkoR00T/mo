package p046f2;

import android.content.Context;
import android.media.AudioManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import v3.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "isTouchExplorationEnabled", "Lf2/to;", "a", "(ZLm2/r;I)Lf2/to;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nq {
    public static final to a(boolean z15, r rVar, int i15) {
        if (t.k()) {
            t.o(216223160, i15, -1, "androidx.compose.material3.rememberTimeInputErrorHandler (TimePicker.android.kt:45)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        a aVar = (a) rVar.N(g1.j());
        boolean zW = rVar.W(context);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = (AudioManager) context.getSystemService("audio");
            rVar.v(objE);
        }
        AudioManager audioManager = (AudioManager) objE;
        boolean zW2 = ((((i15 & 14) ^ 6) > 4 && rVar.a(z15)) || (i15 & 6) == 4) | rVar.W(aVar) | rVar.W(audioManager);
        Object objE2 = rVar.E();
        if (zW2 || objE2 == r.INSTANCE.a()) {
            objE2 = new uo(aVar, audioManager, z15);
            rVar.v(objE2);
        }
        uo uoVar = (uo) objE2;
        if (t.k()) {
            t.n();
        }
        return uoVar;
    }
}
