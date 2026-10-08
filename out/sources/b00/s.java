package b00;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;
import p071kotlin.Metadata;
import p087nuL.b0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lb00/s;", "LnuL/b0;", "Lb00/t;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Lb00/t;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Landroid/net/Uri;", "a", "Landroid/net/Uri;", "photoUri", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends b0<Params, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Uri photoUri;

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Params input) {
        this.photoUri = input.getUri();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri uri = this.photoUri;
        if (uri == null) {
            uri = null;
        }
        intent.putExtra("output", uri);
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.setType("image/*");
        ArrayList arrayList = new ArrayList();
        for (Intent intent3 : pq.v.q(intent, intent2)) {
            for (ResolveInfo resolveInfo : Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent3, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent3, 0)) {
                Intent intent4 = new Intent(intent3);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent4.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                arrayList.add(intent4);
            }
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(0), input.getTitle());
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        return intentCreateChooser;
    }

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Uri c(int resultCode, Intent intent) {
        Uri data;
        if (resultCode != -1) {
            return null;
        }
        if (intent != null && (data = intent.getData()) != null) {
            return data;
        }
        Uri uri = this.photoUri;
        if (uri == null) {
            return null;
        }
        return uri;
    }
}
