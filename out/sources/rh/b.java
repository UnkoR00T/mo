package rh;

import android.content.Context;
import android.os.AsyncTask;
import gg.f;
import gg.g;

/* JADX INFO: loaded from: classes3.dex */
final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f173821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.InterfaceC4440a f173822b;

    b(Context context, a.InterfaceC4440a interfaceC4440a) {
        this.f173821a = context;
        this.f173822b = interfaceC4440a;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            a.a(this.f173821a);
            return 0;
        } catch (f e15) {
            return Integer.valueOf(e15.f72735a);
        } catch (g e16) {
            return Integer.valueOf(e16.a());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f173822b.a();
            return;
        }
        Context context = this.f173821a;
        int i15 = a.f173820e;
        this.f173822b.b(num.intValue(), a.f173816a.b(context, num.intValue(), "pi"));
    }
}
