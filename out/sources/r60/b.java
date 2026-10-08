package r60;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import c20.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import p082nUL.y;
import p60.c;
import q60.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lr60/b;", "", "<init>", "()V", "Landroid/content/Context;", "", "resourceId", "", "c", "(Landroid/content/Context;I)Ljava/lang/String;", "", "listResBitmaps", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "context", "Lm60/a;", "typHolo", "resListBitmap", "Ln60/b;", "b", "(Landroid/content/Context;Lm60/a;Ljava/util/List;)Ln60/b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f171973a = new b();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171974a;

        static {
            int[] iArr = new int[m60.a.values().length];
            try {
                iArr[m60.a.Basic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m60.a.WavingBitmap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m60.a.Hologram.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m60.a.HologramII.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f171974a = iArr;
        }
    }

    private b() {
    }

    private final List<Bitmap> a(Context context, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        try {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                arrayList.add(y5.b.b(y.b(context, iIntValue), 0, 0, null, 7, null));
            }
            return arrayList;
        } catch (Resources.NotFoundException e15) {
            throw new RuntimeException("Resource not found: " + iIntValue, e15);
        } catch (IOException e16) {
            throw new RuntimeException("Could not open resource: " + iIntValue, e16);
        }
    }

    private final String c(Context context, int i15) {
        StringBuilder sb5 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i15)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb5.toString();
                }
                sb5.append(line);
                sb5.append('\n');
            }
        } catch (Resources.NotFoundException e15) {
            throw new RuntimeException("Resource not found: " + i15, e15);
        } catch (IOException e16) {
            throw new RuntimeException("Could not open resource: " + i15, e16);
        }
    }

    public final n60.b b(Context context, m60.a typHolo, List<Integer> resListBitmap) {
        int i15 = a.f171974a[typHolo.ordinal()];
        if (i15 == 1) {
            return new o60.a(context, new Shader("No effect", c(context, e.f22743a), c(context, e.f22744b)), a(context, resListBitmap));
        }
        if (i15 == 2) {
            return new d(context, new Shader("", c(context, e.f22751i), c(context, e.f22752j)), a(context, resListBitmap));
        }
        if (i15 == 3) {
            return new c(context, new Shader("Hologram 1", c(context, e.f22745c), c(context, e.f22746d)), a(context, resListBitmap));
        }
        if (i15 == 4) {
            return new c(context, new Shader("Hologram 2", c(context, e.f22747e), c(context, e.f22748f)), a(context, resListBitmap));
        }
        throw new p();
    }
}
