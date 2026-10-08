package w10;

import dz.b;
import java.text.DecimalFormat;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw10/a;", "Ldz/b;", "<init>", "()V", "", "fileSizeInBytes", "Lmx/a;", "a", "(F)Lmx/a;", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {
    @Override // dz.b
    public Label a(float fileSizeInBytes) {
        String str;
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            if (fileSizeInBytes < 1000.0f) {
                str = decimalFormat.format(Float.valueOf(fileSizeInBytes)) + " B";
            } else if (fileSizeInBytes < 1000000.0f) {
                str = decimalFormat.format(Float.valueOf(fileSizeInBytes / 1000.0f)) + " KB";
            } else {
                str = decimalFormat.format(Float.valueOf(fileSizeInBytes / 1000000.0f)) + " MB";
            }
            return mx.b.b(str, "fileSize");
        } catch (Exception unused) {
            return Label.INSTANCE.b();
        }
    }
}
