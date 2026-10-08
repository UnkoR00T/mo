package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f93925a = new int[2];

    static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f15, float f16, io.sentry.internal.gestures.b.a aVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (d(view2, f15, f16)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                        linkedList.add(viewGroup.getChildAt(i15));
                    }
                }
                for (int i16 = 0; i16 < gestureTargetLocators.size(); i16++) {
                    io.sentry.internal.gestures.b bVarA = gestureTargetLocators.get(i16).a(view2, f15, f16, aVar);
                    if (bVarA != null) {
                        if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE) {
                            bVar = bVarA;
                        } else if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE) {
                            return bVarA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(View view) {
        int id5 = view.getId();
        if (id5 == -1 || c(id5)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id5) : "";
    }

    private static boolean c(int i15) {
        return ((-16777216) & i15) == 0 && (i15 & 16777215) != 0;
    }

    private static boolean d(View view, float f15, float f16) {
        if (view == null) {
            return false;
        }
        int[] iArr = f93925a;
        view.getLocationOnScreen(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        return f15 >= ((float) i15) && f15 <= ((float) (i15 + view.getWidth())) && f16 >= ((float) i16) && f16 <= ((float) (i16 + view.getHeight()));
    }
}
