package androidx.compose.ui.graphics;

import oq.d0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Color$a;", "", "colorLong", "Landroidx/compose/ui/graphics/Color;", "a", "(Landroidx/compose/ui/graphics/Color$a;J)J", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final long a(Color.Companion companion, long j15) {
        long j16 = 63 & j15;
        if (j16 >= 16) {
            j15 = (j15 & (-64)) | (j16 + 1);
        }
        return Color.m6constructorimpl(d0.e(j15));
    }
}
