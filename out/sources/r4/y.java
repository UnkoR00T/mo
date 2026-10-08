package r4;

import android.os.Build;
import android.text.StaticLayout;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lr4/y;", "Lr4/f0;", "<init>", "()V", "Lr4/g0;", "params", "Landroid/text/StaticLayout;", "a", "(Lr4/g0;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "b", "(Landroid/text/StaticLayout;Z)Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y implements f0 {
    @Override // r4.f0
    public StaticLayout a(g0 params) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i15 = Build.VERSION.SDK_INT;
        z.a(builderObtain, params.getJustificationMode());
        if (i15 >= 28) {
            a0.a(builderObtain, params.getUseFallbackLineSpacing());
        }
        if (i15 >= 33) {
            c0.b(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        if (i15 >= 35) {
            d0.a(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // r4.f0
    public boolean b(StaticLayout layout, boolean useFallbackLineSpacing) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            return c0.a(layout);
        }
        if (i15 >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }
}
