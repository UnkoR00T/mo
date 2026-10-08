package r4;

import android.text.StaticLayout;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr4/a0;", "", "<init>", "()V", "Landroid/text/StaticLayout$Builder;", "builder", "", "useFallbackLineSpacing", "Loq/i0;", "a", "(Landroid/text/StaticLayout$Builder;Z)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f171469a = new a0();

    private a0() {
    }

    public static final void a(StaticLayout.Builder builder, boolean useFallbackLineSpacing) {
        builder.setUseLineSpacingFromFallbacks(useFallbackLineSpacing);
    }
}
